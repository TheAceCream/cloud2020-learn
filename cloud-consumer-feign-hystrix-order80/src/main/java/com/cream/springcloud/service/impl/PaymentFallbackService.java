package com.cream.springcloud.service.impl;

import com.cream.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author cj
 * @date 2020-03-15 19:44
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "---PaymentFallbackServiceImpl.paymentInfo_OK fall back";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---PaymentFallbackServiceImpl.paymentInfo_TimeOut fall back";
    }

}
