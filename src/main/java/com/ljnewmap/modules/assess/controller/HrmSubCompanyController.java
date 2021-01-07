package com.ljnewmap.modules.assess.controller;

import com.ljnewmap.common.utils.R;
import com.ljnewmap.modules.assess.service.HrmSubCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrmSubCompanyController {
    @Autowired
    private HrmSubCompanyService hrmSubCompanyService;

    @RequestMapping("hrmsubcompany/tableData")
    private R getTableData() {
        return R.ok().put("tableData", hrmSubCompanyService.getTableData());
    }
}
