package com.cream.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cj
 * @date 2020-03-12 21:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain8080.class,args);
    }

}
