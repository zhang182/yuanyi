package com.yioi.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/*
* 部门关系数据表
*
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Department {
    private Long id;//部门管理id
    private String department;//部门名字
    private String department_belong;//部门所属上级
    private String belong_id;//上级部门编号
    private String department_name;//部门名称
    private String department_id;//部门编号
    private int department_type;//部门状态
    private String department_detail;//部门备注

}
