package com.hp.service;


import com.hp.domain.ProductType;

import java.util.List;

public interface IProductTypeService {

    //查询商品类型表
    List<ProductType> selectAll();
}
