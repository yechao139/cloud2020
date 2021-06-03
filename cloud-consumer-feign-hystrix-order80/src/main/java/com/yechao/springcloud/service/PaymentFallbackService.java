package com.yechao.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ：yechao
 * @date ：Created in 2021/2/4 8:38
 * @version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String payment_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
