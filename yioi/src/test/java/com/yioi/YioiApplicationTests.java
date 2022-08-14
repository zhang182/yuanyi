package com.yioi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@SpringBootTest

class YioiApplicationTests {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Test
    void contextLoads() {
        String s = bCryptPasswordEncoder.encode("123456");
        System.out.println(s);
    }
}
