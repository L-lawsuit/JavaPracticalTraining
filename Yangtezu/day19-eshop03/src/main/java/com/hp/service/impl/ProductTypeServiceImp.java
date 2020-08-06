package com.hp.service.impl;

import com.hp.domain.ProductType;
import com.hp.mapper.IProductTypeMapper;
import com.hp.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImp implements IProductTypeService {

    @Autowired
    private IProductTypeMapper productTypeMapper;


    @Override
    public List<ProductType> selectAll() {
        return productTypeMapper.selectAll();
    }

    @Override
    public ProductType selectProductTypeByTypeId(String type) {
        return productTypeMapper.selectProductTypeByTypeId(type);
    }
}
