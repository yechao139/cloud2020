package com.yechao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ：yechao
 * @date ：Created in 2021/2/1 17:25
 * @version: 1.0
 */
@RestController
@Slf4j
public class OrderController {
    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value= "/consumer/payment/consul")
    public String payment(){
        String result = restTemplate.getForObject(INVOME_URL + "/payment/consul", String.class);
        return result;
    }

}
