package com.yechao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：yechao
 * @date ：Created in 2021/2/2 14:48
 * @version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain80.class, args);
    }
}
