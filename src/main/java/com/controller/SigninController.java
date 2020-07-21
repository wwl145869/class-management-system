package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import sun.awt.SunHints;

/**
 * @author gousheng
 * @date ${Date}- 10:10
 * 注册时的操作控制层
 */
@Controller
@RequestMapping("/SigninController")
public class SigninController {

    @RequestMapping(value="/submitted")
   public ModelAndView Signin(String name,String username,String userpassword){//注册成功后返回到初始页面也是登录页面
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/index");
        System.out.println(name+username+userpassword);
        return mav;
   }

}

