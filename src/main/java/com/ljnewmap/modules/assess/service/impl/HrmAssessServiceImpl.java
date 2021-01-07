package com.ljnewmap.modules.assess.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ljnewmap.modules.assess.dao.HrmAssessDao;
import com.ljnewmap.modules.assess.entity.HrmAssessEntity;
import com.ljnewmap.modules.assess.service.HrmAssessService;
import org.springframework.stereotype.Service;


@Service("hrmAssessService")
public class HrmAssessServiceImpl extends ServiceImpl<HrmAssessDao, HrmAssessEntity> implements HrmAssessService {
    @Override
    public boolean insert(HrmAssessEntity entity) {
        this.baseMapper.insert(entity);
        return true;
    }

    public HrmAssessEntity get(String assessId) {
        return this.baseMapper.get(assessId);
    }
}
