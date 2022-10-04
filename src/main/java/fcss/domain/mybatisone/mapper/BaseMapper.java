package fcss.domain.mybatisone.mapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.RowBounds;
import com.github.pagehelper.Page;
import fcss.domain.mybatisone.condition.QueryWrapper;
import fcss.domain.mybatisone.toolkit.Const;

public interface BaseMapper<T> {

    // -- insert --

    @InsertProvider(type = InsertSqlProvider.class, method = "insert")
    int insert(T entity);

    // -- delete --

    @DeleteProvider(type = DeleteSqlProvider.class, method = "deleteById")
    int deleteById(Serializable id);

    @DeleteProvider(type = DeleteSqlProvider.class, method = "deleteBatchIds")
    int deleteBatchIds(@Param(Const.COLLECTION) Collection<? extends Serializable> idList);

    @DeleteProvider(type = DeleteSqlProvider.class, method = "delete")
    int delete(@Param(Const.WRAPPER) QueryWrapper<T> qw);

    // -- update --

    @UpdateProvider(type = UpdateSqlProvider.class, method = "updateById")
    int updateById(T entity);

    @UpdateProvider(type = UpdateSqlProvider.class, method = "update")
    int update(@Param(Const.ENTITY) T entity, @Param(Const.WRAPPER) QueryWrapper<T> qw);

    // -- select --

    @SelectProvider(type = SelectSqlProvider.class, method = "selectById")
    T selectById(Serializable id);

    @SelectProvider(type = SelectSqlProvider.class, method = "selectBatchIds")
    List<T> selectBatchIds(@Param(Const.COLLECTION) Collection<? extends Serializable> idList);

    @SelectProvider(type = SelectSqlProvider.class, method = "selectCount")
    Long selectCount(@Param(Const.WRAPPER) QueryWrapper<T> qw);

    // @SelectProvider(type = SelectSqlProvider.class, method = "selectOne")
    // T selectOne(final @Param(Const.WRAPPER) QueryWrapper<T> qw);

    default T selectOne(@Param(Const.WRAPPER) QueryWrapper<T> qw) {
        List<T> ts = this.selectList(qw);
        if (ts == null || ts.isEmpty()) {
            if (ts.size() != 1) {
                throw new TooManyResultsException("One record is expected, but the query result is multiple records");
            }
            return ts.get(0);
        }
        return null;
    }

    @SelectProvider(type = SelectSqlProvider.class, method = "selectList")
    List<T> selectList(@Param(Const.WRAPPER) QueryWrapper<T> qw);

    @SelectProvider(type = SelectSqlProvider.class, method = "selectPage")
    Page<T> selectPage(RowBounds rowBounds, @Param(Const.WRAPPER) QueryWrapper<T> qw);
}
