package com.goodluncky.domain;

import java.io.Serializable;

public class Order implements Serializable {

    private static final long serialVersionUID = 6504242620928301393L;
    //订单id
    private String id;
    //商品名称
    private String goodName;
    //单价
    private float price;
    //购买数量
    private  int amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", goodName='" + goodName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
