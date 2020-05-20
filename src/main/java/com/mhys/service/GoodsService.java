package com.mhys.service;

import com.mhys.mapper.GoodsMapper;

import com.mhys.model.Goods;

import com.mhys.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    public List<Goods> selectAll(){
        return goodsMapper.selectAll();
    }
    public  int del(Goods goods){
        return  goodsMapper.del(goods);
    }
    public int insertGoods(Goods goods){
        return goodsMapper.insertGoods(goods);
    }
public List<Goods>selectName(Goods goods){
        return goodsMapper.selectName(goods);
}
public Goods selectId(Goods goods){
        return goodsMapper.selectId(goods);

}
public int updateId(Goods goods){
        return goodsMapper.updateId(goods);
}
}