package com.yechao.springcloud.service;

import com.yechao.springcloud.MockBaseTest;
import com.yechao.springcloud.dao.PaymentDao;
import com.yechao.springcloud.entities.Payment;
import com.yechao.springcloud.service.impl.PaymentServiceImpl;
import org.apache.tomcat.jni.Time;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

/**
 * @author ：yechao
 * @date ：Created in 2021/1/21 17:48
 * @version: 1.0
 */
public class PaymentServiceTest extends MockBaseTest {
    @Mock
    private PaymentDao paymentDao;
    @InjectMocks
    private PaymentServiceImpl paymentService;

    @Test
    public void getPaymentById(){
        Payment payment = paymentDao.getPaymentById(31L);
        System.out.println("hello");
        try {
            TimeUnit.MILLISECONDS.sleep(1222);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
