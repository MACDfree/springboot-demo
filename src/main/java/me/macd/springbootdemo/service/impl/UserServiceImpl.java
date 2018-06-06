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
    // 事务传播中SUPPORTS表示：如果已有事务，则加入此事务；如果没有事务，则单独执行。一般查询操作使用
    @Transactional(propagation = Propagation.SUPPORTS)
    public User findUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    // 事务传播中REQUIRED表示：如果已有事务，则加入此事务；如果没有事务，则新起一个事务执行。一般insert、update、delete操作使用
    @Transactional(propagation = Propagation.REQUIRED)
    public int addUser(User user) {
        if (isExistUserName(user.getUsername())) {
            throw new RuntimeException("此用户已存在");
        }
        return userMapper.insertSelective(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User findUserByUserName(String userName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName);
        return userMapper.selectByExample(userExample).get(0);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean isExistUserName(String userName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName);
        return userMapper.countByExample(userExample) != 0;
    }
}
