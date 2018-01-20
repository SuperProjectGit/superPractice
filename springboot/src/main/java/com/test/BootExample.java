package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring boot example
 *
 * @author super
 * @create 2018-01-21 0:44
 **/
@RestController
//@SpringBootApplication
public class BootExample {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootExample.class, args);
    }
}
