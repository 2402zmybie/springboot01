package com.hr.springboot01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@Slf4j
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @RequestMapping("/hello")
    public String hello() {
        log.debug("hello method is running");
        return "hello spring boot!";
    }
}
