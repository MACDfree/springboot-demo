package me.macd.springbootdemo.service.impl;

import me.macd.springbootdemo.mapper.UserMapper;
import me.macd.springbootdemo.model.User;
import me.macd.springbootdemo.model.UserExample;
import me.macd.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User findUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer saveUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User findUserByUserName(String userName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName);
        return userMapper.selectByExample(userExample).get(0);
    }
}
