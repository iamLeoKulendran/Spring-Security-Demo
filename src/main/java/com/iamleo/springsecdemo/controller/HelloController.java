package com.iamleo.springsecdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {

        return "Hello, Spring Security!";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "<a href='http://iamleo.net'>about</a>"  + request.getSession().getId();
    }
}
