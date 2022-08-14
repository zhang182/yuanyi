package com.yioi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/index")

    public String index(){

        return  "index";
    }

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }


}
