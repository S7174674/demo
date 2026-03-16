package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/hi")
    public String hi() {
        return "Hello World!";
    }

    @Value("${app.login.password}")
    private String validPassword;

    @PostMapping("/t01")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (password.equals(validPassword)) {
            return "登录成功";
        } else {
            return "密码错误, 请联系系统管理员";
        }
    }
}