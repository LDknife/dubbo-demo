package com.ld.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ld.dubbo.service.OrderService;
import com.ld.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/orderService")
public class OrderServiceImpl implements OrderService {

    //dubbo的引用注解
    @Reference
    private UserService userService;

    @Override
    public List<String> createOrder() {
        //调用接口
        List<String> addressList = userService.getAddressListByName("monkey");
        //打印信息
        for (String address: addressList) {
            System.out.println(address);
        }
        return addressList;
    }
}
