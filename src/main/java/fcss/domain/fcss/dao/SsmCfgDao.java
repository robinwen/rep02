// This file is generated automatically. DO NOT modify.
package fcss.domain.fcss.dao;

import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;
import fcss.domain.fcss.entity.SsmCfgEntity;
import fcss.domain.mybatisone.mapper.BaseMapper;

@Mapper
public interface SsmCfgDao extends BaseMapper<SsmCfgEntity> {

    Page<SsmCfgEntity> selectPage1(@Param("where") Map<String, Object> where);
}
