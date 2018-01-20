package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * example service
 *
 * @author super
 * @create 2018-01-21 1:02
 **/
@Service
public class ExampleService {

    @Value("${name:World}")
    private String name;

    public String getMessage() {
        return "Hello " + name;
    }
}
