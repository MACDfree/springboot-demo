package me.macd.springbootdemo.controller;

import me.macd.springbootdemo.model.User;
import me.macd.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    // RequestBody注解表示将post请求body里的内容反序列化成所修饰的参数类型
    public Result addUser(@RequestBody User user) {
        if (StringUtils.isEmpty(user.getUsername())) {
            return Result.error(5000, "用户名必填");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            return Result.error(5000, "密码必填");
        }
        user.setSalt("123");
        userService.addUser(user);
        return Result.ok();
    }
}
