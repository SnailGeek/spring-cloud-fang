package com.forzep.servicehi.controller;

import brave.sampler.Sampler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ZipKinTestController {
    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/zipkin/hi")
    public String callHome(){
        log.info("calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8763/miya", String.class);
    }

    @GetMapping("/zipkin/info")
    public String info(){
        log.info("calling trace service-hi");
        return "I'm service-hi";
    }

    @Bean
    public Sampler sampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
