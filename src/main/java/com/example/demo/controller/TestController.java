package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping
    public String home() {
        testService.getValue();
        User user = new User();
        user.setName("dddd");
       return  "Hello World!";
    }
}
