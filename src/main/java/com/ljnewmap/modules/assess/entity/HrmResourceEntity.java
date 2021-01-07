package com.ljnewmap.modules.assess.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("HrmResource")
public class HrmResourceEntity {
    private int id;
    private String lastname;
    private int seclevel;
    private int departmentid;
    
}
