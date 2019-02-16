package com.mb.request;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:**/applicationContext*.xml"})
public class RequestTest {

    @Autowired
    Login login;
    @Autowired
    QueryAccount queryAccount;

    @Test
    public void loginTest(){
        login.loginOnline("米小圈","123456");
    }
}
