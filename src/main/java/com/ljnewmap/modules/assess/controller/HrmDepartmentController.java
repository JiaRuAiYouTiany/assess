package com.ljnewmap.modules.assess.controller;

import com.ljnewmap.modules.assess.entity.HrmDepartmentEntity;
import com.ljnewmap.modules.assess.service.HrmDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HrmDepartmentController {

    @Autowired
    private HrmDepartmentService hrmDepartmentService;

    @RequestMapping("hrmdepartment/getTableData")
    private List<HrmDepartmentEntity> getTableData() {
        return hrmDepartmentService.getTableData();
    }
}
