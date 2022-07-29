package com.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor2 implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...");

        String par = request.getParameter("par");
        if ("a".equals(par)) {
            return true;//开关打开
        } else {
            request.getRequestDispatcher("/err.jsp").forward(request, response);
            return false;
        }
    }

}
