package com.ld.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启dubbo注解
@EnableDubbo
@SpringBootApplication
public class DubboBootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboBootProviderApplication.class, args);
    }
}
