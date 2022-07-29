package com.Interceptor.data.Impl;



import com.Interceptor.data.Jdbcdata;
import com.Interceptor.data.JdbcInterface;
import com.Interceptor.domain.User;
import com.mysql.cj.util.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.Statement;

//@RunWith(SpringJUnit4ClassRunner.class)
@Component("jdbcCru")

public class JdbcCru implements JdbcInterface {




    public void updateLogin(String pass,String user) {
        Jdbcdata jd = new Jdbcdata();

        JdbcTemplate jdbcTemplate = jd.jdbcdatafunction();
        jdbcTemplate.update("update login set password = ? where user = ? ",pass,user);
    }

//    @Test
    public void insertUser(String pass,String user){

        Jdbcdata jd = new Jdbcdata();
        JdbcTemplate jdbcTemplate = jd.jdbcdatafunction();

        jdbcTemplate.update("insert into login(user,password) value(?,?) ",user,pass);
    }
//@Test
    public boolean loginYz(String user,String pass){

        boolean flag = false;
    Jdbcdata jd = new Jdbcdata();
    JdbcTemplate jdbcTemplate = jd.jdbcdatafunction();



        User us=  jdbcTemplate.queryForObject("select * from login where user = ?",new BeanPropertyRowMapper<User>(User.class),user);



        String zh = us.getUser();

        String pa = us.getPassword(); System.out.println(zh+"数据库pa"+pa+"输入的pa"+pass);

        if( (pass.equals(pa))&&user.equals(zh)){
            return true;
        }else{
            return false;
        }


    }

    public String userPassword(String user){
        Jdbcdata jd = new Jdbcdata();
        JdbcTemplate jdbcTemplate = jd.jdbcdatafunction();
        User us =   jdbcTemplate.queryForObject("select * from login where user = ?",new BeanPropertyRowMapper<User>(User.class),user);
        String zh = us.getUser();

        String pa = us.getPassword();
        System.out.println("方法"+zh+pa);
        return pa;
    }
}
