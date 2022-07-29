package com.Interceptor.web;

import com.Interceptor.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ServletContext servletContext =this.getServletContext();
        ApplicationContext app = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        UserService service =(UserService)app.getBean("userServicce");

service.save();
    }

}



