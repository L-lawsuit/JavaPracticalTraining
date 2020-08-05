package com.hp.service.impl;

import com.hp.domain.Product;
import com.hp.mapper.IProductMapper;
import com.hp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements IProductService {

    @Autowired
    private IProductMapper productMapper;
    @Override
    public List<Product> newProduct() {
        return productMapper.newProduct();
    }

    @Override
    public List<Product> rank() {
        return productMapper.getRank();
    }

    @Override
    public List<Product> selectByTypeName(String typeName,int num) {
        return productMapper.selectByTypeName(typeName,num);
    }
}
