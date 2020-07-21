package com.controller;

import com.pojo.Teacher;
import com.pojo.User;
import com.serviec.Class_grade;
import com.serviec.TeacherServiceIf;
import com.serviec.UserServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author gousheng
 * @date ${Date}- 11:00
 * 访问时请求操作控制层
 */
@Controller
public class IndexController {

    @Autowired
    UserServiceIf userServiceIf;
    @Autowired
    TeacherServiceIf teacherServiceIf;
    @RequestMapping(value = "/class-management-system")
   public String  index(HttpServletRequest request, HttpServletResponse response){//唯一访问接口
        //获取sessionID;
        String SessionId = request.getRequestedSessionId();
        //获取访问客户端的IP地址
        String ip = request.getRemoteAddr();
        int i=0;
        System.out.println("----------------------------------系统被访问"+ ++i);
        System.out.println("----------------------------------访问这ip地址是"+ip+"sessionID="+SessionId);
        //新增教师
        Teacher teacher = new Teacher();
        teacher.setName("张老师");
        teacher.setAge(29);
        teacher.setSex("男");
        teacher.setPhone(1111111111);
        teacher.setPolitics("群众");
        List<Class_grade> class_grades = teacherServiceIf.referTeachergrade();

        Iterator<Class_grade> iterator = class_grades.iterator();
        while (iterator.hasNext()){
            Class_grade t = iterator.next();
            System.out.println(t.toString());
        }


        return"home/index";
   }

    @RequestMapping("/SignIn")
    public ModelAndView SignIn(HttpServletRequest request, HttpServletResponse response){//注册接口
        ModelAndView mov = new ModelAndView();
        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(6);
        mov.setViewName("home/signin");
        mov.addObject("hello","wwl");
        return mov;
   }
}
