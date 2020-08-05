package com.hp.service;

import com.hp.domain.Product;

import java.util.List;

public interface IProductService {
    //查询新品
    List<Product> newProduct();

    //查询商品排行榜
    List<Product> rank();

    //根据商品类型查询商品
    List<Product> selectByTypeName(String type, int num);

    //查询类型、品牌、搜索关键字对应的商品
    List<Product> selectProductByType(String type, String brands, String words);
}
