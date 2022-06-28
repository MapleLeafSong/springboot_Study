package com.bofangcp.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String getName(){
        return "hello world";
    }
    @RequestMapping("/wrong")
    public String queryNamge(){
        return "oh,wrong 404";
    }



}
