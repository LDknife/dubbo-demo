package com.ld.dubbo.service;

import java.util.List;

/**
 * 用户服务接口
 */
public interface UserService {


    /**
     * 通过用户名查询地址列表
     * @param name 用户名
     * @return
     */
    public List<String> getAddressListByName(String name);
}
