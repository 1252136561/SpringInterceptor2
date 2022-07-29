package com.Interceptor.data;

import com.Interceptor.config.SpringConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;


public class Jdbcdata {

    @Resource(name = "dataSource")
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate jdbcdatafunction() {

        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(app.getBean("jdbcTemplate").getClass().getName());

        return (JdbcTemplate) app.getBean("jdbcTemplate");
    }
}

