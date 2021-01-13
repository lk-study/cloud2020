package com.atguigu.springcloud.service.impl;
import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
/**
 * @description:
 * @author: lk
 * @time: 2020/12/23 16:05
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}
