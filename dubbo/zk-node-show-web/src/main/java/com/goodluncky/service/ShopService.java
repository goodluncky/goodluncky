package com.goodluncky.service;

import com.goodluncky.domain.Address;
import com.goodluncky.domain.Order;
import vo.Goods;

import java.util.List;

public interface ShopService {
    //购买商品，生成订单
    public Order buyGoods(Integer userId, Goods goods);

    //获取用户的地址列表
    public List<Address> getAddress(Integer userId);
}
