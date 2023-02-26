package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {
    @ResponseBody
    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello World!";
    }
}
