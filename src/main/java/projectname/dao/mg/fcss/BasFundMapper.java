package projectname.dao.mg.fcss;

import org.apache.ibatis.annotations.Param;
import projectname.vo.mg.fcss.BasFund;
import projectname.vo.mg.fcss.BasFundExample;

public interface BasFundMapper {
    long countByExample(BasFundExample example);

    int deleteByPrimaryKey(Long basFundId);

    int insert(BasFund row);

    int insertSelective(BasFund row);

    BasFund selectByPrimaryKey(Long basFundId);

    int updateByExampleSelective(@Param("row") BasFund row, @Param("example") BasFundExample example);

    int updateByExample(@Param("row") BasFund row, @Param("example") BasFundExample example);

    int updateByPrimaryKeySelective(BasFund row);

    int updateByPrimaryKey(BasFund row);
}