package com.example.demo.controller;

import com.example.demo.service.impl.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class HelloController {

    private final HelloService helloService;
//    @Autowired
//    private HelloService helloService;

    @GetMapping("/hi")
    public String hi() {
        return helloService.hi();
    }

    @Value("${app.login.password}")
    private String validPassword;

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        return helloService.register(username, password);
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam(required = false, defaultValue = "111111") String password) {
        return helloService.login(username, password);
    }
}