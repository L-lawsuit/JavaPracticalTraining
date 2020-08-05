package com.hp.service.impl;

import com.hp.domain.Carousel;
import com.hp.mapper.ICarouselMapper;
import com.hp.service.ICarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImp implements ICarouselService {
    @Autowired
    private ICarouselMapper carouselMapper;

    @Override
    public List<Carousel> selectAll() {
        return carouselMapper.selectAll();
    }
}
