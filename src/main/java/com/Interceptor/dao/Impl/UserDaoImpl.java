package com.Interceptor.dao.Impl;

import com.Interceptor.dao.UserDao;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("UserDao Go");
    }


}
