package com.goodluncky.service;

import com.goodluncky.domain.Order;

public interface ShopService {
    public Order buyGoods(Integer userId, String goodName, float price,int amount);
}
