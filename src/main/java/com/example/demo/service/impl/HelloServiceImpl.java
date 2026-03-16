package com.example.demo.service.impl;

import cn.hutool.crypto.digest.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hi() {
        return "Hello World!";
    }

    @Override
    public String register(String username, String password) {
        return BCrypt.hashpw(password);
    }

    @Override
    public String login(String username, String password) {
        boolean isSucceed = BCrypt.checkpw(password, "$2a$10$Fis5igIxr8x0FcDKc/C4uOne/68Vk9E0i8QfGllGKSJqaCfP/eyKW");
        if (isSucceed) {
            return "登录成功";
        } else {
            return "密码错误, 请联系系统管理员";
        }
    }
}
