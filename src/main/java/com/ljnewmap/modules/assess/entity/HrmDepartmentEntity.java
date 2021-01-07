package com.ljnewmap.modules.assess.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("HrmDepartment")
public class HrmDepartmentEntity {
    public int id;
    public String departmentmark;
    public String departmentname;
    public int subcompanyid1;
    public int supdepid;
    public String allsupdepid;
    public int showorder;
    public String canceled;
    public String departmentcode;
    public int coadjutant;
    public String zzjgbmfzr;
    public String zzjgbmfgld;
    public String jzglbmfzr;
    public String jzglbmfgld;
    public String bmfzr;
    public String bmfgld;
    public String outkey;
    public int budgetAtuoMoveOrder;
    public String ecology_pinyin_search;
    public int tlevel;
}
