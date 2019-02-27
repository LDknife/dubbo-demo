package com.ld.dubbo;

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
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();

        int read = System.in.read();
    }

}
