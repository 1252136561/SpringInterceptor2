package com.Interceptor.service;

import com.Interceptor.domain.User;

public interface UserService {

    public void save();


    User login(String user, String pass);
}
