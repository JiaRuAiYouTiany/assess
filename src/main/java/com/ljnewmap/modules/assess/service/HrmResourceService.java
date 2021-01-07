package com.ljnewmap.modules.assess.service;

import com.ljnewmap.modules.assess.entity.HrmResourceEntity;

import java.util.List;

public interface HrmResourceService {
    HrmResourceEntity getResourceById(int id);

    HrmResourceEntity getDepManagerByDepId(int depId);

    List<HrmResourceEntity> getDepMembers(int depId);
}
