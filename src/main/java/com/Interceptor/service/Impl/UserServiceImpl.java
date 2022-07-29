package com.Interceptor.service.Impl;

import com.Interceptor.dao.UserDao;
import com.Interceptor.domain.User;
import com.Interceptor.service.UserService;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")

    private UserDao userDao;
    public void save() {
        System.out.println("Service Go...");
    }

    public User login(String user, String pass) {
        try {
            User us = userDao.findByUserAndPassword(user, pass);

            System.out.println(us.toString());
            return us;

        }catch (EmptyResultDataAccessException e){
            return  null;
        }
    }


}