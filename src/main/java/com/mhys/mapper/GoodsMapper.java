package com.mhys.mapper;

import com.mhys.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    List<Goods> selectAll();
    List<Goods>selectName(Goods goods);
    int del(Goods goods);
    int insertGoods(Goods goods);
    Goods selectId (Goods goods);
    int updateId(Goods goods);
}