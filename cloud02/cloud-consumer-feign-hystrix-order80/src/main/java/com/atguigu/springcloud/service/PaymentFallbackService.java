package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author Gao Biao
 * @Date 2020/11/10 20:38
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    public String paymentInfo_ok(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_OK";
    }

    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_TimeOut";
    }
}
