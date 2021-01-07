package com.ljnewmap.modules.assess.service;

import com.ljnewmap.modules.assess.entity.HrmDepartmentEntity;

import java.util.List;

public interface HrmDepartmentService {
    List<HrmDepartmentEntity> getTableData();

    HrmDepartmentEntity getDepById(int depId);

    HrmDepartmentEntity getDepByName(String depName);
}
