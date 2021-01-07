package com.ljnewmap.modules.assess.service;

import com.ljnewmap.modules.assess.entity.HrmAssessEntity;

public interface HrmAssessService {
    boolean insert(HrmAssessEntity e);

    HrmAssessEntity get(String assessId);
}
