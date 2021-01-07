package com.ljnewmap.modules.policy.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("policy")
public class PolicyEntity {
    private int id;
    private String type;
    private String name;
    private String regionLevel;
    private String industry;
    private String region;
    private Date publishDate;
    private Date uploadDate;
    private String secretLevel;
    private int effective;
}
