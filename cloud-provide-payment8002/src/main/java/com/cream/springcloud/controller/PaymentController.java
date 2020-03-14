package com.cream.springcloud.controller;

import com.cream.springcloud.entities.CommonResult;
import com.cream.springcloud.entities.Payment;
import com.cream.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author cj
 * @date 2020-03-08 15:05
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        System.out.println(result);
        log.info("******插入结果"+result);
        if (result>0){
            return new CommonResult(200,"成功,serverPort:"+serverPort,result);
        }else {
            return new CommonResult(444,"失败,serverPort:"+serverPort);
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        System.out.println(payment);
        log.info("******查询结果"+payment+"O(∩_∩)O哈哈~");
        if (payment!=null){
            return new CommonResult(200,"成功,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult(300,"无对应记录,serverPort:"+serverPort);
        }
    }

    @GetMapping(value = "/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
