package com.zking.crm.controller;

import com.zking.crm.biz.IUserBiz;
import com.zking.crm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserBiz userBiz;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "forward:/input/jsp/login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User user, HttpSession session) {
        User user1 = userBiz.doLogin(user);
        System.out.println(user1);
        String path="";
        if (null != user1) {
            path="redirect:/sysTreeNode/toNode?method=list";
        } else {
            path="redirect:/user/toLogin";
        }
        System.out.println(path);
        session.setAttribute("user", user1);
        return path;
    }
}
