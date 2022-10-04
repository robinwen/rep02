package fcss.domain.mybatisone.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;
import fcss.domain.mybatisone.condition.QueryWrapper;
import fcss.domain.mybatisone.toolkit.Const;

public class UpdateSqlProvider<T> extends SqlProviderSupport {

    // TODO 不知原因, 測試結果, 不能加 @Param(Const.ENTITY) T entity, 會無法對應到 T entity
    public String updateById(ProviderContext context, T entity) {
        TableInfo table = super.tableInfo(context);

        String[] setSeqment = table.columns.stream() //
                .filter(one -> one.getValue(entity) != null && one != table.pk) // 只需要: 若entity屬性值 != null, 且 不含PK
                .map(one -> one.columnName + " = " + one.propertyBind()) //
                .toArray(String[]::new);

        String[] whereSegment = new String[] {table.pk.columnName + " = " + table.pk.propertyBind()};

        return sqlUpdate(table.tableName, setSeqment, whereSegment);

    }

    public String update(ProviderContext context, @Param(Const.ENTITY) T entity,
            @Param(Const.WRAPPER) QueryWrapper<T> qw) {
        TableInfo table = super.tableInfo(context);

        String[] setSeqment = table.columns.stream() //
                .filter(one -> one.getValue(entity) != null) // 只需要: 若entity屬性值 != null, 含PK
                .map(one -> one.columnName + " = " + one.propertyBind(Const.ENTITY)) //
                .toArray(String[]::new);

        return sqlUpdate(table.tableName, setSeqment, qw.whereSegment());
    }

    // 產生UPDATE SQL
    private String sqlUpdate(String tableName, final String[] setSegment, String[] whereSegment) {
        SQL sql = new SQL() //
                .UPDATE(tableName) //
                .SET(setSegment) //
                .WHERE(whereSegment);

        return "<script>" + sql.toString() + "</script>";
    }
}
