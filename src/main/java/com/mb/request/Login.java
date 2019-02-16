package com.mb.request;

import com.mb.aop.AssertOK;
import org.springframework.stereotype.Component;

@Component
public class Login {

    @AssertOK(isLogin = "ture")
    public String login(String username,String password){
        System.out.println(username+" 登录成功 "+", 登录的密码是 "+password);
        return "登录成功";
    }

    @AssertOK(isLogin = "false")
    public String loginOnline(String name,String pwd){
        String login = login(name, pwd);
        System.out.println("login 的返回值："+login);
        return "loginOnline 成功";
    }
}
