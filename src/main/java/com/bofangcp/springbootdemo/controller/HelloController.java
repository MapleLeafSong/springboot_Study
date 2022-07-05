package com.bofangcp.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String getName(Model model){
        model.addAttribute("msg","hello,spring boot");
        return "hello";
    }


    @RequestMapping("/wrong")
    public String queryNamge(){
        return "oh,wrong 404";
    }



}
