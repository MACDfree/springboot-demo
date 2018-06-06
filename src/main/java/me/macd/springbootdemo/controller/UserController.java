package me.macd.springbootdemo.controller;

import me.macd.springbootdemo.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    // RequestBody注解表示将post请求body里的内容反序列化成所修饰的参数类型
    public Result addUser(@RequestBody User user) {
        System.out.println(user);
        return Result.ok();
    }
}
