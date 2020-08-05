package com.hp.mapper;

import com.hp.domain.Carousel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarouselMapper {

    @Select("select * from s_carousel order by sequence_num desc")
    List<Carousel> selectAll();
}
