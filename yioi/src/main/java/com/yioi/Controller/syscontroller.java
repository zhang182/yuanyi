package com.yioi.Controller;


import com.yioi.Mapper.UserMapper;
import com.yioi.Pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class syscontroller {
    @Resource
    UserMapper userMapper;

    @Autowired
    Employee employee;
    @GetMapping("/empdo")
    public List<Map<String,Object>> findeall(){
        employee.setCompany("恒益");
        return userMapper.selectinfo(employee);
    }
}
