package com.goodluncky.service.impl;

import com.goodluncky.domain.Address;
import com.goodluncky.domain.Order;
import com.goodluncky.service.OrderService;
import com.goodluncky.service.ShopService;
import com.goodluncky.service.UserInfoService;
import vo.Goods;

import java.util.List;

public class ShopServiceImpl implements ShopService {
    //定义远程接口作为属性
    private OrderService orderService;
    private UserInfoService userInfoService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @Override
    public Order buyGoods(Integer userId, Goods goods) {
        //调用远程服务：服务提供者的订单功能
        Order order = orderService.createOrder(userId, goods.getName(), goods.getPrice(), goods.getAmount());
        return order;
    }

    @Override
    public List<Address> getAddress(Integer userId) {
        //调用UserInfoService服务提供者
        List<Address> list = userInfoService.queryAddress(userId);
        return list;
    }
}
