package com.ljnewmap.modules.assess.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("HrmAssess")
public class HrmAssessEntity {
    private String assessid;
    private String result;
}
