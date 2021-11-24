package com.demo.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    
    @GetMapping("/")
    public String home (){
        return "Azure cloud is great";
    }

    @GetMapping("/hello")
    public String hello (){
        return "Hello Spring";
    }
}
