package com.cream.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cj
 * @date 2020-03-15 13:03
 */
public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
