package com.cream.springcloud.service.impl;

import com.cream.springcloud.dao.PaymentDao;
import com.cream.springcloud.entities.Payment;
import com.cream.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cj
 * @date 2020-03-08 15:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
