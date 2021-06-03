package com.yechao.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yechao.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：yechao
 * @date ：Created in 2021/2/3 16:47
 * @version: 1.0
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_Fall")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id")Integer id){
        String result = paymentHystrixService.payment_OK(id);
        log.info("*******result:"+result);
        return result;
    }

    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id")Integer id){
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }

    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout2/{id}")
    public String paymentInfo_TimeOut2(@PathVariable("id")Integer id){
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id")Integer id) {
        return "我是消费者80，支付系统繁忙请10秒后再试o(╥﹏╥)o";
    }

    public String payment_Global_Fall(){
        return "Global异常处理信息，请稍后再试,(┬＿┬)";
    }



}




















