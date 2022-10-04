package projectname.dao.mg.fcss;

import org.apache.ibatis.annotations.Param;
import projectname.vo.mg.fcss.BasOrg;
import projectname.vo.mg.fcss.BasOrgExample;

public interface BasOrgMapper {
    long countByExample(BasOrgExample example);

    int deleteByPrimaryKey(Long basOrgId);

    int insert(BasOrg row);

    int insertSelective(BasOrg row);

    BasOrg selectByPrimaryKey(Long basOrgId);

    int updateByExampleSelective(@Param("row") BasOrg row, @Param("example") BasOrgExample example);

    int updateByExample(@Param("row") BasOrg row, @Param("example") BasOrgExample example);

    int updateByPrimaryKeySelective(BasOrg row);

    int updateByPrimaryKey(BasOrg row);
}