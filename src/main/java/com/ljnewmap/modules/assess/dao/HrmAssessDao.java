package com.ljnewmap.modules.assess.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ljnewmap.modules.assess.entity.HrmAssessEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HrmAssessDao extends BaseMapper<HrmAssessEntity> {
    HrmAssessEntity get(@Param("id") String id);
}
