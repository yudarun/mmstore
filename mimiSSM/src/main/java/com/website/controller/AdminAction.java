package com.website.controller;

import com.website.pojo.Admin;
import com.website.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminAction {

    @Autowired
    AdminService adminService;
    @RequestMapping("/login")
    public ModelAndView login(String name , String pwd ){
        ModelAndView mv = new ModelAndView();
        Admin admin = adminService.login(name,pwd);
        if (admin != null){
           mv.addObject("admin",admin);
           mv.setViewName("main");
            return mv;
        }else {
            mv.addObject("errmsg","用户名或密码不正确");
            mv.setViewName("login");
            return mv;
        }

    }
}
