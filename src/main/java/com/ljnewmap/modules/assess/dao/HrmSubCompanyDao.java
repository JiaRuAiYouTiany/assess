package com.ljnewmap.modules.assess.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ljnewmap.modules.assess.entity.HrmSubCompanyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HrmSubCompanyDao extends BaseMapper<HrmSubCompanyEntity> {
    List<HrmSubCompanyEntity> getTableData();
}
