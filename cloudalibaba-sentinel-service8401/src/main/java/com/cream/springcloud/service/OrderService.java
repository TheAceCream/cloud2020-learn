package com.cream.springcloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author cj
 * @date 2020-03-19 20:42
 */
@Service
@Slf4j
public class OrderService {

    @SentinelResource("getOrder")
    public String getOrder(){
        log.info("=====order=====");
        return "order";
    }


}
