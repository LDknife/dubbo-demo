package com.ld.dubbo;

import com.ld.dubbo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

    /**
     * 1.导包，api,dubbo,监控中心客户端
     * 2.配置文件
     * 3.解析配置文件，运行程序
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        applicationContext.start();
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.createOrder();

        System.in.read();
    }
}
