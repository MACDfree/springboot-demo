package me.macd.springbootdemo.service;

import me.macd.springbootdemo.model.User;

public interface UserService {
    User findUserById(Integer id);
    Integer saveUser(User user);
    User findUserByUserName(String userName);
}
