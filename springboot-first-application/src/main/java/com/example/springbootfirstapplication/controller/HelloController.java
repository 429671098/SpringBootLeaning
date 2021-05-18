package com.example.springbootfirstapplication.controller;

import com.example.springbootfirstapplication.bean.ConfigBean;
import com.example.springbootfirstapplication.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class HelloController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    User user;

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;

    @GetMapping("/hello")
    public String hello() {
        return name + ":" + age;

    }

    @GetMapping("/hello1")
    public String hello1() {
        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
    }

    @GetMapping("/hello2")
    public String hello2() {
        return user.getName() + " >>>>" + user.getAge();
    }

}
