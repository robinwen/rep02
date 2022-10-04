package projectname.dao.mg.fcss;

import org.apache.ibatis.annotations.Param;
import projectname.vo.mg.fcss.BasTwca;
import projectname.vo.mg.fcss.BasTwcaExample;

public interface BasTwcaMapper {
    long countByExample(BasTwcaExample example);

    int deleteByPrimaryKey(Long basTwcaId);

    int insert(BasTwca row);

    int insertSelective(BasTwca row);

    BasTwca selectByPrimaryKey(Long basTwcaId);

    int updateByExampleSelective(@Param("row") BasTwca row, @Param("example") BasTwcaExample example);

    int updateByExample(@Param("row") BasTwca row, @Param("example") BasTwcaExample example);

    int updateByPrimaryKeySelective(BasTwca row);

    int updateByPrimaryKey(BasTwca row);
}