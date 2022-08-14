package com.yioi.Mapper;

import com.yioi.Pojo.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    //对用户进行查询

     List<Map<String,Object>> selectinfo(Employee employee);
    //对用户进行手机号方式进行删除
    int deletuserinfo(String number);
    //增加用户信息
    int adduserinfo(Employee employee);
    //改动用户信息
    int updateuserinfo(String name);
}
