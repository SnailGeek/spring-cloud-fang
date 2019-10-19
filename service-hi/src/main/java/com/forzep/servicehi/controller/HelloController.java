package com.forzep.servicehi.controller;

import com.forzep.servicehi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "forzep") String name){
        return helloService.Hello(name);
    }
}
