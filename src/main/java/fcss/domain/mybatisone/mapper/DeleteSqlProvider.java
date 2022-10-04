package fcss.domain.mybatisone.mapper;

import java.io.Serializable;
import java.util.Collection;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;
import fcss.domain.mybatisone.condition.QueryWrapper;
import fcss.domain.mybatisone.toolkit.Const;

public class DeleteSqlProvider<T> extends SqlProviderSupport {

    public String deleteById(ProviderContext context, Serializable id) {
        TableInfo table = super.tableInfo(context);

        String[] whereSegment = new String[] {table.pk.columnName + " = " + table.pk.propertyBind()};

        return sqlDelete(table.tableName, whereSegment);
    }

    public String deleteBatchIds(ProviderContext context,
            @Param(Const.COLLECTION) Collection<? extends Serializable> idList) {
        TableInfo table = super.tableInfo(context);

        String sqlIn = String.format(
                "<foreach collection='%s' index='index' item='item' open='(' close=')' separator=','>#{item}</foreach>",
                Const.COLLECTION);

        String[] whereSegment = new String[] {table.pk.columnName + " in " + sqlIn};

        return sqlDelete(table.tableName, whereSegment);
    }

    public String delete(ProviderContext context, @Param(Const.WRAPPER) QueryWrapper<T> qw) {
        TableInfo table = super.tableInfo(context);

        return sqlDelete(table.tableName, qw.whereSegment());
    }

    // 產生DELETE SQL
    private String sqlDelete(String tableName, String[] whereSegment) {
        SQL sql = new SQL() //
                .DELETE_FROM(tableName) //
                .WHERE(whereSegment);

        return "<script>" + sql.toString() + "</script>";
    }
}
