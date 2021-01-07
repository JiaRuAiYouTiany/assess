package com.ljnewmap.modules.assess.controller;

import com.ljnewmap.common.utils.R;
import com.ljnewmap.modules.assess.entity.HrmDepartmentEntity;
import com.ljnewmap.modules.assess.entity.HrmResourceEntity;
import com.ljnewmap.modules.assess.service.HrmDepartmentService;
import com.ljnewmap.modules.assess.service.HrmResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.*;

@RestController
public class HrmResourceController {
    @Autowired
    private HrmResourceService hrmResourceService;
    @Autowired
    private HrmDepartmentService hrmDepartmentService;

    @RequestMapping("resource/getresourcebyid")
    public R getResourceById(@RequestBody Map<String, Object> params) {
        Map<String, Object> data = new HashMap<String, Object>();

        int id = Integer.parseInt(params.get("id").toString());
        HrmResourceEntity resource = hrmResourceService.getResourceById(id);

        String[] filterNames = {"胡亚波", "马泽江", "陈剑敏", "沈涛", "肖昌东", "余宏平",
                "朱小飞", "管乐声", "王博", "王德强", "王伟", "陈刚",
                "林汝湛", "邓辉", "陈诚", "吴天昊", "钱思静", "杜安睿", "陈冲", "宋洁瑶",
                "何战库", "彭拥军", "陈康", "王琪", "邓杰竞", "包亮玉", "张瑾", "邱胜"};


        if (resource != null) {
            String[] depNameArr = {"综合一处", "综合二处", "综合三处", "发展一处", "发展二处", "发展三处"};
            List<HrmResourceEntity> managers = new ArrayList<HrmResourceEntity>();//处室负责人
            for (int i = 0; i < depNameArr.length; i++) {
                HrmDepartmentEntity d = hrmDepartmentService.getDepByName(depNameArr[i]);
                if (d != null) {
                    managers.add(hrmResourceService.getDepManagerByDepId(d.getId()));
                }
            }
            data.put("managers", this.filter(filterNames, managers));
            int depId = resource.getDepartmentid();
            if (depId == 9) {//委领导
                List<HrmResourceEntity> ownMembers = new ArrayList<HrmResourceEntity>();//分管处室工作人员
                List<HrmResourceEntity> otherMembers = new ArrayList<>();//其他处室工作人员
                String resourceName = resource.getLastname();
                List<String> ownDepNames = new ArrayList<String>();
                if (resourceName.equals("沈涛")) {
                    ownDepNames.add("综合一处");
                    ownDepNames.add("综合三处");
                    ownDepNames.add(("发展三处"));
                } else if (resourceName.equals("肖昌东")) {
                    ownDepNames.add("综合二处");
                    ownDepNames.add("发展二处");
                } else if (resourceName.equals("余宏平")) {
                    ownDepNames.add("发展一处");
                }
                List<String> otherDepNames = new ArrayList<String>();
                for(int i = 0; i < depNameArr.length; i++) {
                    if (!ownDepNames.contains(depNameArr[i])) {
                        otherDepNames.add(depNameArr[i]);
                    }
                }

                //开始进行查询
                data.put("managers", this.filter(filterNames, managers));
                //分管处室工作人员
                ownMembers.addAll(this.filter(filterNames, getDepMembers(ownDepNames)));

                data.put("ownMembers", ownMembers);
                //其他处室工作人员
                otherMembers.addAll(this.filter(filterNames, getDepMembers(otherDepNames)));
                data.put("otherMembers", otherMembers);
            } else {
                HrmResourceEntity r = hrmResourceService.getDepManagerByDepId(depId);
                HrmDepartmentEntity dep = hrmDepartmentService.getDepById(depId);
                List<HrmResourceEntity> ownMembers = hrmResourceService.getDepMembers(dep.getId());
                data.put("ownMembers", this.filter(filterNames, ownMembers));

                List<String> otherDepNames = new ArrayList<String>();
                int i = 0;
                for (; i < depNameArr.length; i++) {
                    if (!depNameArr[i].equals(dep.getDepartmentname())) {
                        otherDepNames.add(depNameArr[i]);
                    }
                }
                List<HrmResourceEntity> otherMembers =  getDepMembers(otherDepNames);
                data.put("otherMembers", this.filter(filterNames, otherMembers));
//                if (resource.getId() == r.getId()) {//处室负责人
//
//                } else {//处室工作人员
//                    List<HrmResourceEntity> managers = new ArrayList<HrmResourceEntity>();
//                    data.put("managers", managers);
//
//                    List<HrmResourceEntity> ownMembers = hrmResourceService.getDepMembers(dep.getId());
//                    data.put("ownMembers", ownMembers);
//
//                    List<String> otherDepNames = Arrays.asList(depNameArr);
//                    int i = 0;
//                    for (; i < otherDepNames.size(); i++) {
//                        if (otherDepNames.get(i).equals(dep.getDepartmentname())) {
//                            break;
//                        }
//                    }
//                    otherDepNames.remove(i);
//                    List<HrmResourceEntity> otherMembers = getDepMembers(otherDepNames);
//                    data.put("otherMembers", otherMembers);
//                }
            }
        }

        data.put("resource", resource);
        return R.ok().put("data", data);
    }

    private List<HrmResourceEntity> getDepMembers(List<String> depNames) {
        List<HrmResourceEntity> list = new ArrayList<HrmResourceEntity>();
        for (int i = 0; i < depNames.size(); i++) {
            HrmDepartmentEntity d = hrmDepartmentService.getDepByName(depNames.get(i));
            if (d != null) {
                list.addAll(hrmResourceService.getDepMembers(d.getId()));
            }
        }
        return list;
    }

    private List<HrmResourceEntity> filter(String[] filterNames, List<HrmResourceEntity> list) {
        List<HrmResourceEntity> result = new ArrayList<HrmResourceEntity>();
        for (int i = 0; i < list.size(); i++) {
            if (this.filter(filterNames, list.get(i).getLastname())) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    private boolean filter(String[] filterNames, String name) {
        for (int i = 0; i < filterNames.length; i++) {
            if (filterNames[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

}
