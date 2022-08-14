package com.yioi.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {
    private Integer id;
    private String company;    //公司名称
    private String type;        //公司类型
    private String company_address; //公司地址
    private String company_number; //公司联系号码
    private String department;  //员工所处部门
    private String post;        //所处岗位
    private String company_account;     //公司银行账号
    private String account_name;        //开户银行名字
    private String employee_name;       //员工姓名
    private String employee_number;     //员工电话
    private String employee_sex;        //员工性别
    private String employee_qq;         //员工qq
    private String employee_mail;       //员工邮箱
    private String employee_address;    //员工地址
    private String employee_id;     //员工身份证号
    private int user_status;    //员工状态
    private String user_avatar;     //员工头像
    private String registration_time;       //员工注册时间
}
