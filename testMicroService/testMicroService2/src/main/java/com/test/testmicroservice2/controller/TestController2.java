package com.test.testmicroservice2.controller;

import com.test.testmicroservice2.entity.TestReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    @PostMapping("/test")
    public String test(@RequestBody TestReq testReq){
        return String.format("Tomcat %s 8082",testReq.getName());
    }
}
