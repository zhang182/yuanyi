package com.yioi.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class Logincontroller {

    @PostMapping("/login")
    public String hello(@RequestBody String id, String pwd){
        System.out.println("ζεθΏθ‘");
        return "ok";
    }
}
