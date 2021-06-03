package com.yechao.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：yechao
 * @date ：Created in 2021/1/19 17:57
 * @version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getTestTemplate(){
        return new RestTemplate();
    }
}
