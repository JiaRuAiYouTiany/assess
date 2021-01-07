package com.ljnewmap.modules.assess.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("HrmSubCompany")
public class HrmSubCompanyEntity {
    public int id;
    public String subcompanyname;
    public String subcompanydesc;
    public int companyid;
    public int supsubcomid;
    public String url;
    public int showorder;
    public String canceled;
    public String subcompanycode;
    public String outkey;
    public int budgetAtuoMoveOrder;
    public String ecology_pinyin_search;
    public int limitUsers;
    public int tlevel;
}
