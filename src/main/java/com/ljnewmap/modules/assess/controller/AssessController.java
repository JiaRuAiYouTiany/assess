package com.ljnewmap.modules.assess.controller;

import com.ljnewmap.common.utils.R;
import com.ljnewmap.modules.assess.entity.HrmAssessEntity;
import com.ljnewmap.modules.assess.service.HrmAssessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class AssessController {
    @Autowired
    private HrmAssessService hrmAssessService;

    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("assess/save")
    public R save(@RequestBody Map<String, String> params) {
        String assessId = params.get("assessId");
        if (hrmAssessService.get(assessId) != null) {
            return R.error("已经完成测评，无需重复提交");
        }
        String result = params.get("result");
        HrmAssessEntity entity = new HrmAssessEntity();
        entity.setAssessid(assessId);
        entity.setResult(result);
        hrmAssessService.insert(entity);
        return R.ok();
    }
}
