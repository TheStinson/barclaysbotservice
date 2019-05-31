package com.barclaycard.hackathon.befuturemindservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RemoteServiceConfig {

    @Bean
    public RestTemplate riseMarketplaceRestTemplate() {
        return new RestTemplate();
    }
}