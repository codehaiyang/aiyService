package com.sbdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @RequestMapping(value = "/hi")
    public String hi(){
        return "hello spring boot";
    }

}
