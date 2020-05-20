package com.mhys.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods {
    private int id;
    private String goodsName;
    private double goodsPrice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
