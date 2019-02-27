package com.ld.dubbo.service.impl;

import com.ld.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private com.ld.dubbo.service.UserService userService;

    public List<String> createOrder() {
        //调用接口
        List<String> addressList = userService.getAddressListByName("monkey");
        //打印信息
        for (String address: addressList) {
            System.out.println(address);
        }
        return null;
    }
}
