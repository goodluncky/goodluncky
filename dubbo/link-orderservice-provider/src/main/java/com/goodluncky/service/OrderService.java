package com.goodluncky.service;

import com.goodluncky.domain.Order;

public interface OrderService {
    //创建订单
    public Order createOrder(Integer userId, String goodName, float price, int amount);
}
