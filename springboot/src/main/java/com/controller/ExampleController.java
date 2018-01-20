package com.controller;

import com.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * example controller
 *
 * @author super
 * @create 2018-01-21 1:05
 **/
@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping("/say")
    @ResponseBody
    public String say() {
        return exampleService.getMessage();
    }
}
