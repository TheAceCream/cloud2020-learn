package com.cream.springcloud.service;

import com.cream.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author cj
 * @date 2020-03-08 15:01
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
