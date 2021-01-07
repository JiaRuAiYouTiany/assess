package com.ljnewmap.modules.policy.service;

import com.baomidou.mybatisplus.service.IService;
import com.ljnewmap.modules.policy.entity.PolicyEntity;

import java.util.List;

public interface PolicyService extends IService<PolicyEntity> {
    List<PolicyEntity> getTableData();
}
