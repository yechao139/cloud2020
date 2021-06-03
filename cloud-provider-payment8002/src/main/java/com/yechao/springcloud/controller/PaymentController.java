package com.yechao.springcloud.controller;

import com.yechao.springcloud.entities.CommonResult;
import com.yechao.springcloud.entities.Payment;
import com.yechao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author ：yechao
 * @date ：Created in 2021/1/8 9:01
 * @version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果：{}",result);
        if (result > 0) {
            return new CommonResult(200,"插入数据库成功",result);
        }
        return new CommonResult(444,"插入数据库失败",null);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("**********查询结果：{}",payment);
        if (payment != null){
            return new CommonResult(HttpStatus.OK.value(),"查询成功,serverPort: "+serverPort,payment);
        }
        return new CommonResult(444,"没有对应记录3，查询ID："+id,null);
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
