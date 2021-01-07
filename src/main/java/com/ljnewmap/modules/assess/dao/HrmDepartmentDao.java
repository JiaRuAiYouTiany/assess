package com.ljnewmap.modules.assess.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ljnewmap.modules.assess.entity.HrmDepartmentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Mapper
public interface HrmDepartmentDao extends BaseMapper<HrmDepartmentEntity> {
    List<HrmDepartmentEntity> getTableData();

    HrmDepartmentEntity getDepById(@Param("depId") int depId);

    HrmDepartmentEntity getDepByName(@Param("depName") String depName);
}
