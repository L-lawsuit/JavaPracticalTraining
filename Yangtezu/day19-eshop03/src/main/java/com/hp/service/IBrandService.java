package com.hp.service;

import com.hp.domain.Brand;

import java.util.List;

public interface IBrandService {

    //查询当前类型下的所有分类
    List<Brand> selectBrandByTypeId(String type);
}
