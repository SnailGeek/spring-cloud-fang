package com.forzep.servicehi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Value("${server.port}")
    private Integer serverPort;

    public String Hello(String name){
        return String.format("Hi, %s, I am port: %s", name, serverPort);
    }
}
