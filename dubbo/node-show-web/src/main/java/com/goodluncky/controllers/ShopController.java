package com.goodluncky.controllers;

import com.goodluncky.domain.Address;
import com.goodluncky.domain.Order;
import com.goodluncky.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vo.Goods;

import java.util.List;

@Controller
@RequestMapping("/buy")
public class ShopController {
    @Autowired
    private ShopService shopService;
    //购买商品
    @RequestMapping("goods")
    public ModelAndView buyGoods(Integer userId, Goods goods){
        ModelAndView mv  = new ModelAndView();
        //调用ShopService的方法，完成创建订单
        Order order = shopService.buyGoods(userId,goods);
        mv.addObject("myorder",order);
        mv.setViewName("view-order");
        return mv;
    }
    //获取地址
    @RequestMapping("getaddress")
    public ModelAndView getAddress(Integer userId){
        ModelAndView mv = new ModelAndView();
        List<Address> list = shopService.getAddress(userId);
        //把数据放入到Model
        mv.addObject("list",list);
        mv.setViewName("view-address");
        return mv;

    }
}
