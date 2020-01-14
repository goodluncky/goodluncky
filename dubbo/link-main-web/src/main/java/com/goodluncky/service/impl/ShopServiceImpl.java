package com.goodluncky.service.impl;

import com.goodluncky.domain.Order;
import com.goodluncky.service.OrderService;
import com.goodluncky.service.ShopService;

public class ShopServiceImpl implements ShopService {
    private OrderService orderService;

    //spring的IOC设值注入
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public Order buyGoods(Integer userId, String goodName, float price, int amount) {
        //购买商品生成订单，订单生成有服务提供者orderservice-provider完成的
        //需要调用服务提供者的方法createOrder()
        Order order = orderService.createOrder(userId,goodName,price,amount);
        //其他的业务逻辑
        return order;
    }
}
