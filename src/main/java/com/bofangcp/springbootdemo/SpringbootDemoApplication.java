package com.bofangcp.springbootdemo;

import com.bofangcp.springbootdemo.servlet.Myservlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Servlet;

@SpringBootApplication
//@ComponentScan(); --重新换地方
@ServletComponentScan
public class SpringbootDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    public ServletRegistrationBean<Myservlet> getServletRegistrationBean(){
        ServletRegistrationBean<Myservlet> bean = new ServletRegistrationBean<>(new Myservlet());
        bean.setLoadOnStartup(1);
        return bean;
    }


}
