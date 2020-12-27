package com.acme.k8s.controller;

import com.acme.k8s.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private AppConfig appConfig;

    @RequestMapping("/")
    public String greeting() {
        return appConfig.getRabbitMQUrl();
    }

}
