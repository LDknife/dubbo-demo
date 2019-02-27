package com.ld.dubbo.service.impl;

import com.ld.dubbo.bean.User;
import com.ld.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户接口实现类
 */
public class UserServiceImpl implements UserService {

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
