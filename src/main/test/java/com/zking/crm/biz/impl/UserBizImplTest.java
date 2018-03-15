package com.zking.crm.biz.impl;

import com.zking.crm.BaseTest;
import com.zking.crm.biz.IUserBiz;
import com.zking.crm.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserBizImplTest extends BaseTest {

    @Autowired
    private IUserBiz userBiz;

    private User user;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        user = new User();
    }

    @Test
    public void doLogin() throws Exception {
        user.setUserName("admin");
        user.setUserPassword("123");
        User user1 = userBiz.doLogin(this.user);
        System.out.println(user1);
    }

}