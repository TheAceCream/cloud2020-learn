package com.cream.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cj
 * @date 2020-03-13 14:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8080.class,args);
    }

}
