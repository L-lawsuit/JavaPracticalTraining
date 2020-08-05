package com.hp.service;

import com.hp.domain.Carousel;

import java.util.List;

public interface ICarouselService {
    //查询轮播图
    List<Carousel> selectAll();
}
