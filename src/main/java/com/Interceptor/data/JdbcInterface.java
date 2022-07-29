package com.Interceptor.data;

public interface JdbcInterface {

    public void updateLogin(String pass,String user);
    public void insertUser(String pass,String user);
    public boolean loginYz(String user,String pass);
}
