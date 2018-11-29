package com.wsf.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WangShuFa on 2018/8/30.
 */
@RestController
@RequestMapping("/hello")
public class HelloSpringBootController {

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }
}