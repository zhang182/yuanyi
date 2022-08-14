package com.yioi.Mapper;

import com.yioi.Pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DepartmentMapper {
    //增删改查
    int adddepartment (Department department);
    //删除部门信息  传入当前页面的所处展示公司的部门名称 进行删除
    int deletepartment(String department);

    //改动部门信息
    int updatepartment(Department department);
    //查询用户信息 从当前用户读取出所属公司，然后进行查询该公司的部门组织树
    List<Map<String,Object>> selectdepartment(String  company_name);





}
