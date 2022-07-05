package com.bofangcp.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/getName")
    @ResponseBody
    public String getMain(){
        return "please wait a minutes!!!";
    }

    @RequestMapping("/getMessage")
    @ResponseBody
    public String getMessage(){
        return "good news ";
    }



}
