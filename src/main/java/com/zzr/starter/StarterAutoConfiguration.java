package com.zzr.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(StarterProperties.class)
public class StarterAutoConfiguration {

    @Resource
    private StarterProperties starterProperties;

    @Bean
    @ConditionalOnMissingBean
    public StarterService init() {
        StarterService starterService = new StarterService();
        starterService.setA(starterProperties.getString());
        return starterService;
    }
}
