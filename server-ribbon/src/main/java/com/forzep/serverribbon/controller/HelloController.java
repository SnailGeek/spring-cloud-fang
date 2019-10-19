package com.forzep.serverribbon.controller;

import com.forzep.serverribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "forze") String name){
        return helloService.hello(name);
    }

}
