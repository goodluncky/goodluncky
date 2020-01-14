package com.goodluncky.service.impl;

import com.goodluncky.domain.Order;
import com.goodluncky.service.OrderService;

import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Integer userId, String goodName, float price, int amount) {
        System.out.println("-----------------创建订单-------------");
        //把订单记录到数据库
        Order order = new Order();
        order.setId(UUID.randomUUID().toString().replaceAll("-",""));
        order.setGoodName(goodName);
        order.setAmount(amount);
        order.setPrice(price);
        return order;
    }
}
