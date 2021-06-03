package com.yechao.springcloud.dao;

import com.yechao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：yechao
 * @date ：Created in 2021/1/8 8:50
 * @version: 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}
