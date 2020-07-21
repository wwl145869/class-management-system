package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gousheng
 * @date ${Date}- 11:24
 * //登录后操作的控制层
 */
@Controller
@RequestMapping(value = "/LoginController")
public class LoginController {//登录成功or失败时做出不同反应
    @RequestMapping(value = "/login")
    public ModelAndView login(String username,String userpassword,String code){//参数用户账号，用户密码，验证码
        ModelAndView mav = new ModelAndView();

        mav.setViewName("student/controller");
        return mav;
    }
    @ResponseBody
    @RequestMapping("/responseUserJson")
    public List<User> responseUserJson(){
        List<User> list = new ArrayList<User>();
        for(int i=1;i<30;i++){
            User user = new User(i,"张江","root","kaisa",i);
            list.add(user);
        }
        System.out.println("111111111111111111111111111");
        return list;
    }
}
