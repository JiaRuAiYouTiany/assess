package com.ljnewmap.modules.policy.controller;

import com.ljnewmap.common.utils.R;
import com.ljnewmap.modules.policy.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @RequestMapping("policy/tableData")
    private R getTableData() {
        return R.ok().put("tableData", policyService.getTableData());
    }
}
