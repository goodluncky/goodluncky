package com.goodluncky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class OrderProvicerApplication {
    public static void main(String[] args) throws IOException {
        String config = "orderservice-provider.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //容器的启动方法
        ((ClassPathXmlApplicationContext)ctx).start();
        //让提供者一直运行
        System.in.read();
    }
}
