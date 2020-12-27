package com.acme.k8s.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value( "${rabbitMQ.url}" )
    private String rabbitMQUrl;

    public String getRabbitMQUrl() {
        return rabbitMQUrl;
    }

    public void setRabbitMQUrl(String rabbitMQUrl) {
        this.rabbitMQUrl = rabbitMQUrl;
    }
}
