package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String Home() {
        return "12312";
    }
    
}
