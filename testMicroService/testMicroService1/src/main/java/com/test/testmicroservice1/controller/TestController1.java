package com.test.testmicroservice1.controller;

import com.test.testmicroservice1.entity.TestReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {

    @PostMapping("/test")
    public String test(@RequestBody TestReq testReq){
        return String.format("Tomcat %s 8081",testReq.getName());
    }
}
