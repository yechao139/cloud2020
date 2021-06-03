package com.yechao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@Slf4j
public class OrderZkController {
    public static final String INVOME_URL = "http://cloud-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentzk(){
        return restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
    }

}