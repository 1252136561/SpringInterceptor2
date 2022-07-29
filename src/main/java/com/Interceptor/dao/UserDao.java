package com.Interceptor.dao;

import com.Interceptor.domain.User;

public interface UserDao {

    public void save();

    User findByUserAndPassword(String user, String pass);
}
