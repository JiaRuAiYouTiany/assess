package com.ljnewmap.modules.policy.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ljnewmap.modules.policy.dao.PolicyDao;
import com.ljnewmap.modules.policy.entity.PolicyEntity;
import com.ljnewmap.modules.policy.service.PolicyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("policyService")
public class PolicyServiceImpl extends ServiceImpl<PolicyDao, PolicyEntity> implements PolicyService {
    @Override
    public List<PolicyEntity> getTableData() {
        return this.selectList(new EntityWrapper<PolicyEntity>());
    }
}
