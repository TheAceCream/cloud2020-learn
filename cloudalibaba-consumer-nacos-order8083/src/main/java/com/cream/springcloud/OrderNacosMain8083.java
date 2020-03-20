package com.cream.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cj
 * @date 2020-03-18 11:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain8083 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain8083.class,args);
    }

}
