package com.hp.service.impl;

import com.hp.domain.Brand;
import com.hp.mapper.IBrandMapper;
import com.hp.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImp implements IBrandService {

    @Autowired
    private IBrandMapper brandMapper;
    @Override
    public List<Brand> selectBrandByTypeId(String type) {
        return brandMapper.selectBrandByTypeId(type);
    }
}
