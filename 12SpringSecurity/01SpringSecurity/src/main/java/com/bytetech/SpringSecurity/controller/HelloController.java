package com.bytetech.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest req) {
        return "Hello World!!! "+req.getSession().getId();
    }

    @GetMapping("/about")
    public String about() {
        return "About Byte-Tech";
    }
}
