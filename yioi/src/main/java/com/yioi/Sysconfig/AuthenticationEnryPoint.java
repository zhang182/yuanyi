package com.yioi.Sysconfig;

import com.google.gson.Gson;
import com.yioi.Pojo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationEnryPoint  implements AuthenticationEntryPoint {

    @Autowired
    Gson gson;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        Msg result = Msg.fail("需要登录!!");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(gson.toJson(result));


    }
}