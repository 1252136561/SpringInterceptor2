package com.Interceptor.dao.Impl;

import com.Interceptor.dao.UserDao;

import com.Interceptor.data.Jdbcdata;
import com.Interceptor.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {

    public void save(){

        System.out.println("UserDao Go");
    }

    public User findByUserAndPassword(String user, String pass) throws EmptyResultDataAccessException {
        Jdbcdata jdbcdata = new Jdbcdata();

        JdbcTemplate jdbcTemplate = jdbcdata.jdbcdatafunction();

        User us = jdbcTemplate.queryForObject("select * from login where user = ? and password = ?",new BeanPropertyRowMapper<User>(User.class),user,pass);

        return us;
    }


}
