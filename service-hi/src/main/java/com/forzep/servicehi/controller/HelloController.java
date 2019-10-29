package com.forzep.servicehi.controller;

import com.forzep.servicehi.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hello(@RequestParam(value = "name", defaultValue = "forzep") String name){
        return helloService.Hello(name);
    }

    public String hiError(String name){
        return "hi, " + name + "sorry error!";
    }
}
