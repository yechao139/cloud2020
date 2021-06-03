package com.yechao.springcloud.service;

import com.yechao.springcloud.entities.CommonResult;
import com.yechao.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ：yechao
 * @date ：Created in 2021/2/2 14:59
 * @version: 1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Integer id);

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();
}
