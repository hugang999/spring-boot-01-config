package com.hugang.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@Value("${person.name}")
    private String name;

    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "hello:" + name;
    }
}
