package com.ljnewmap.modules.assess.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ljnewmap.modules.assess.dao.HrmSubCompanyDao;
import com.ljnewmap.modules.assess.entity.HrmSubCompanyEntity;
import com.ljnewmap.modules.assess.service.HrmSubCompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hrmSubCompanyService")
public class HrmSubCompanyServiceImpl extends ServiceImpl<HrmSubCompanyDao, HrmSubCompanyEntity> implements HrmSubCompanyService {
    @Override
    public List<HrmSubCompanyEntity> getTableData() {
        return baseMapper.getTableData();
//        return this.selectList(new EntityWrapper<HrmSubCompanyEntity>());
    }
}
