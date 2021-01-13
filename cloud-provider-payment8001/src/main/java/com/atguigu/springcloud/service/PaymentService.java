package com.atguigu.springcloud.service;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
/**
 * @description:
 * @author: lk
 * @time: 2020/12/23 16:05
 */
public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(@Param("id") Long id);  //读取
}