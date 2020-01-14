package com.goodluncky;

import com.goodluncky.domain.Order;
import com.goodluncky.service.ShopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumeApplication {
    public static void main(String[] args) {
        String config = "main-consume.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取业务对象
        ShopService service = (ShopService) ctx.getBean("shopService");
        Order order = service.buyGoods(1, "thinkpad", 5000, 1);
        System.out.println("购买商品的订单："+order);
    }
}
