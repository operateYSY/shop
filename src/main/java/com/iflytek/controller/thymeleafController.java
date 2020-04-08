package com.iflytek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thymeleafController {

    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }
}
