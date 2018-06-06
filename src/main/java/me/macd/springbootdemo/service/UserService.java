package me.macd.springbootdemo.service;

import me.macd.springbootdemo.model.User;

public interface UserService {
    User findUserById(Integer id);
    int addUser(User user);
    User findUserByUserName(String userName);
    boolean isExistUserName(String userName);
}
