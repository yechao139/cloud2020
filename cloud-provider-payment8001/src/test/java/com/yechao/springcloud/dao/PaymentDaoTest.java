package com.yechao.springcloud.dao;

import com.yechao.springcloud.BaseTest;
import com.yechao.springcloud.entities.Payment;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author ：yechao
 * @date ：Created in 2021/1/21 10:20
 * @version: 1.0
 */
public class PaymentDaoTest extends BaseTest {
    @Resource
    private PaymentDao paymentDao;

    @Test
    public void testGetPaymentById(){
        Payment payment = paymentDao.getPaymentById(31L);
        Assert.assertEquals("微服务2020111",payment.getSerial());
    }

}
