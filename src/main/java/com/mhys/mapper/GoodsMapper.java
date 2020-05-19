package com.mhys.mapper;

import com.mhys.model.Goods;
import com.mhys.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    List<Goods> selectAll();
    int del(Goods goods);
}