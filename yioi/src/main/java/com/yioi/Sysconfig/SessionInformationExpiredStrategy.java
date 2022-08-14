package com.yioi.Sysconfig;

import com.google.gson.Gson;
import com.yioi.Pojo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SessionInformationExpiredStrategy implements org.springframework.security.web.session.SessionInformationExpiredStrategy {


    @Autowired
    Gson gson;

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
        Msg result= Msg.fail("您的账号在异地登录，建议修改密码");
        HttpServletResponse response=event.getResponse();
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(gson.toJson(result));


}}
