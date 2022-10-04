package fcss.domain.mybatisone.mapper;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import org.apache.ibatis.builder.annotation.ProviderContext;
import fcss.domain.mybatisone.annotation.TableField;
import fcss.domain.mybatisone.annotation.TableId;
import fcss.domain.mybatisone.annotation.TableName;

abstract public class SqlProviderSupport {

    private static Map<Class<?>, TableInfo> tableCache = new ConcurrentHashMap<>(512);

    protected TableInfo tableInfo(ProviderContext context) {

        Class<?> clazz = context.getMapperType();
        TableInfo table = tableCache.get(clazz);
        if (table != null) {
            return table;
        }

        // 取得: 以泛型定義的Entity型別
        Class<?> entity =
                (Class<?>) ((ParameterizedType) (clazz.getGenericInterfaces()[0])).getActualTypeArguments()[0];

        // 建立TableInfo, 並Cache到static variable
        table = new TableInfo();
        table.entity = entity;
        table.tableName = entity.getAnnotation(TableName.class).value(); // TableName == 定義在@TableName
        table.columns = new ArrayList<>();

        // Entity全部public屬性, 均為DB欄位
        for (Field fd : entity.getFields()) {
            TableInfo.Column col = table.newColumn();

            col.field = fd;
            col.propertyName = fd.getName(); // Entity屬性名

            // DB欄位名 == (依優先序)1.定義在@TableId, 2.定義在@TableField, 3.Entity屬性名
            if (fd.isAnnotationPresent(TableId.class)) {
                col.columnName = fd.getAnnotation(TableId.class).value();
                col.idtype = fd.getAnnotation(TableId.class).type();
                table.pk = col;
            } else if (fd.isAnnotationPresent(TableField.class)) {
                col.columnName = fd.getAnnotation(TableField.class).value();
            } else {
                col.columnName = col.propertyName;
            }

            table.columns.add(col);
        }

        tableCache.put(clazz, table);
        return table;
    }

    protected String[] columns(Field[] fields) {
        return Stream.of(fields).map(this::columnName).toArray(String[]::new);
    }

    protected String primaryKeyColumn(Field[] fields) {
        return Stream.of(fields).filter(field -> field.isAnnotationPresent(TableId.class)).findFirst() // 返回第一个primaryKey的field
                .map(this::columnName).orElse("id");
    }

    protected String columnName(Field field) {
        return field.getName();
    }

}
