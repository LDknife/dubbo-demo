package com.ld.dubbo.controller;

import com.ld.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/test")
    public List<String> getAddress(){
        return orderService.createOrder();
    }
}
