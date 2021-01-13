package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: lk
 * @time: 2020/12/23 15:58
 */
@Mapper
public interface PaymentDao {
    public Integer create(Payment payment); //写
    public Payment getPaymentById(@Param("id") Long id);  //读取
}
