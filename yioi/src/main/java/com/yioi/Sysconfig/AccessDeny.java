package com.yioi.Sysconfig;


import com.google.gson.Gson;
import com.yioi.Pojo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AccessDeny implements AccessDeniedHandler {

    @Autowired
    Gson gson;

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        Msg result= Msg.denyAccess("无权访问，need Authorities!!");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(gson.toJson(result));



}}
