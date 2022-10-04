package fcss.domain.mybatisone.mapper;

import java.io.Serializable;
import java.util.Collection;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;
import fcss.domain.mybatisone.condition.QueryWrapper;
import fcss.domain.mybatisone.toolkit.Const;

public class SelectSqlProvider<T> extends SqlProviderSupport {

    public String selectById(ProviderContext context, Serializable id) {
        TableInfo table = super.tableInfo(context);

        String selectSegment = String.join(",", table.columns.stream().map(c -> c.columnName).toArray(String[]::new));
        String[] whereSegment = new String[] {table.pk.columnName + " = " + table.pk.propertyBind()};

        return sqlSelect(table.tableName, selectSegment, whereSegment);
    }

    public String selectBatchIds(ProviderContext context,
            @Param(Const.COLLECTION) Collection<? extends Serializable> idList) {
        TableInfo table = super.tableInfo(context);

        String sqlIn = String.format(
                "<foreach collection='%s' index='index' item='item' open='(' close=')' separator=','>#{item}</foreach>",
                Const.COLLECTION);

        String selectSegment = String.join(",", table.columns.stream().map(c -> c.columnName).toArray(String[]::new));
        String[] whereSegment = new String[] {table.pk.columnName + " in " + sqlIn};

        return sqlSelect(table.tableName, selectSegment, whereSegment);
    }

    public String selectCount(ProviderContext context, @Param(Const.WRAPPER) QueryWrapper<T> qw) {
        TableInfo table = super.tableInfo(context);

        return sqlSelect(table.tableName, "count(*)", qw.whereSegment());
    }

    // public String selectOne(ProviderContext context, final @Param(Const.WRAPPER) QueryWrapper<T> qw) {
    // TableInfo table = super.tableInfo(context);
    //
    // return getSimpleSql(table.tableName, qw.selectSegment(), qw.whereSegment());
    // }

    public String selectList(ProviderContext context, @Param(Const.WRAPPER) QueryWrapper<T> qw) {
        TableInfo table = super.tableInfo(context);

        return sqlSelect(table.tableName, qw.selectSegment(), qw.whereSegment());
    }

    public String selectPage(ProviderContext context, @Param(Const.WRAPPER) QueryWrapper<T> qw) {
        return "";
    }

    // 產生SELECT SQL
    private String sqlSelect(String tableName, String selectSegment, String[] whereSegment) {
        SQL sql = new SQL() //
                .SELECT(selectSegment) //
                .FROM(tableName) //
                .WHERE(whereSegment);

        return "<script>" + sql.toString() + "</script>";
    }
}
