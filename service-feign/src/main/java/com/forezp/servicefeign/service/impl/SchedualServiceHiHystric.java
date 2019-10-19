package com.forezp.servicefeign.service.impl;

import com.forezp.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi, " + name + ", sorry, error!";
    }
}
