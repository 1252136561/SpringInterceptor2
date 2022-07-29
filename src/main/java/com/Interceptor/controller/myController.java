package com.Interceptor.controller;

import com.Interceptor.data.Impl.JdbcCru;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class myController {


    @RequestMapping("/1")

    public ModelAndView show() {

        System.out.println("资源执行...");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("demo");

        modelAndView.addObject("name", "itcase");

        return modelAndView;

    }


    @RequestMapping("/login")
//    @ResponseBody
    public ModelAndView Login(HttpServletRequest request) {
        JdbcCru jdbcCru = new JdbcCru();
        String user = request.getParameter("user");
        String password  = request.getParameter("password");

        ModelAndView modelAndView = new ModelAndView();



        boolean flag = jdbcCru.loginYz(user, password);
        System.out.println("回写:"+password+"flag:"+flag);

        if (flag) {
            modelAndView.setViewName("success");
            String pa  = jdbcCru.userPassword(user);
//            Map<String,String> map = new HashMap();
//            map.put("user",user);
//            map.put("pass",pa);
//            modelAndView.addObject(map);
            request.setAttribute("user",user);
            request.setAttribute("pass",pa);
//modelAndView.addObject("user","user");
//modelAndView.addObject("pass","pa");
            return modelAndView;

        } else {
            modelAndView.setViewName("denglu");
            request.setAttribute("err","账号密码错误");
//            modelAndView.addObject("err","账号密码错误");

            return modelAndView;

        }
    }


    @RequestMapping("/zhucee")

    public ModelAndView zhucee(String user, String pass) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("denglu");
        System.out.println("用户"+user+"密码"+pass);
        JdbcCru jdbcCru = new JdbcCru();




        jdbcCru.insertUser(user,pass);
        return modelAndView;
    }


}
