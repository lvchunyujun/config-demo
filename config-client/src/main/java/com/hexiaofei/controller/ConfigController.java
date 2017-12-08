package com.hexiaofei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/8.
 */
@RestController
@RefreshScope
@Configuration
public class ConfigController {

    @Value("${key}")
    private String key;


    @RequestMapping("/hi")
    public String getKey(){
        return key;
    }
}
