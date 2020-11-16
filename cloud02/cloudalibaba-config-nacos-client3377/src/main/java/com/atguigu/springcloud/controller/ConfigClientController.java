package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Gao Biao
 * @Date 2020/11/15 15:23
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private  String configInfo;

    @GetMapping("/config/info")
    public String getConfig() {
        return configInfo;
    }
}
