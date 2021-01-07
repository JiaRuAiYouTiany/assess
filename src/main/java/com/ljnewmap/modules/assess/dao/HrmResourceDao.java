package com.ljnewmap.modules.assess.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ljnewmap.modules.assess.entity.HrmResourceEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HrmResourceDao extends BaseMapper<HrmResourceEntity> {
    HrmResourceEntity getResourceById(@Param("id") int id);

    HrmResourceEntity getDepManagerByDepId(@Param("depId") int depId);

    List<HrmResourceEntity> getDepMembers(@Param("depId") int depId);
}
