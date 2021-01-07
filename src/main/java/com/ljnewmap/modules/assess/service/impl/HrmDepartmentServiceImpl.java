package com.ljnewmap.modules.assess.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ljnewmap.modules.assess.dao.HrmDepartmentDao;
import com.ljnewmap.modules.assess.entity.HrmDepartmentEntity;
import com.ljnewmap.modules.assess.service.HrmDepartmentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("hrmDepartmentService")
public class HrmDepartmentServiceImpl extends ServiceImpl<HrmDepartmentDao, HrmDepartmentEntity> implements HrmDepartmentService {
    @Override
    public List<HrmDepartmentEntity> getTableData() {
        return baseMapper.getTableData();
    }

    @Override
    public HrmDepartmentEntity getDepById(int depId) {
        return baseMapper.getDepById(depId);
    }

    @Override
    public HrmDepartmentEntity getDepByName(String depName) {
        return baseMapper.getDepByName(depName);
    }
}
