package fcss.domain.mybatisone.mapper;

import java.util.stream.Collectors;
import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;
import fcss.domain.mybatisone.annotation.IdType;
import fcss.domain.mybatisone.toolkit.UUIDGenerator;

public class InsertSqlProvider<T> extends SqlProviderSupport {

    public String insert(ProviderContext context, T entity) {
        TableInfo table = super.tableInfo(context);

        switch (table.pk.idtype) {
            case AUTO:
            case INPUT:
                break;
            case ASSIGN_UUID:
                table.pk.setValue(entity, UUIDGenerator.getUUID());
                break;
        }

        // 篩選出 需要insert的欄位
        var cols = table.columns.stream() //
                .filter(one -> one.getValue(entity) != null) // 只需要: 若entity屬性值 != null
                .filter(one -> !(one == table.pk && one.idtype == IdType.AUTO)) //
                .collect(Collectors.toList());

        SQL sql = new SQL() //
                .INSERT_INTO(table.tableName);

        cols.forEach(y -> {
            sql.VALUES(y.columnName, y.propertyBind());
        });

        return sql.toString();
    }

}
