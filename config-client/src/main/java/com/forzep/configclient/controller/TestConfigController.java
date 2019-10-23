package com.forzep.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestConfigController {
    @Value("${foo}")
    private String foo;

    @GetMapping("/hi")
    public String hi() {
        return foo;
    }
}
