package com.Interceptor.service.Impl;

import com.Interceptor.dao.UserDao;
import com.Interceptor.service.UserService;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")

    private UserDao userDao;
    public void save() {
        System.out.println("Service Go...");
    }


}