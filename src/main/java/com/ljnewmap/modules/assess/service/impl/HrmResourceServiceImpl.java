package com.ljnewmap.modules.assess.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ljnewmap.modules.assess.dao.HrmResourceDao;
import com.ljnewmap.modules.assess.entity.HrmResourceEntity;
import com.ljnewmap.modules.assess.service.HrmResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hrmResourceService")
public class HrmResourceServiceImpl extends ServiceImpl<HrmResourceDao, HrmResourceEntity> implements HrmResourceService {
    @Override
    public HrmResourceEntity getResourceById(int id) {
        return baseMapper.getResourceById(id);
    }

    @Override
    public HrmResourceEntity getDepManagerByDepId(int depId) {
        return baseMapper.getDepManagerByDepId(depId);
    }

    @Override
    public List<HrmResourceEntity> getDepMembers(int depId) {
        return baseMapper.getDepMembers(depId);
    }
}
