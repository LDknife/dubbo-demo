package com.ld.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ld.dubbo.bean.User;
import com.ld.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

//@Service 是dubbo的注解，不是spring的
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<String> getAddressListByName(String s) {
        System.out.println("查询的用户名为：" + s);
        if("monkey".equals(s)){
            List<String> addressList = new ArrayList<String>();
            addressList.add("南京市栖霞区");
            addressList.add("南京市河西");
            User user = new User("monkey", 12, addressList);
            return user.getAddressList();
        }
        return null;
    }
}
