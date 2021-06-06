package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String Hello(Map<String,Object> map){
        map.put("hello","232");
        return "/index";
    }
}
