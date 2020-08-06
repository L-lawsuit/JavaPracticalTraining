package com.hp.mapper;

import com.hp.domain.Brand;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBrandMapper {

    @Select("select * from s_brand where brand_type=#{type}")
    List<Brand> selectBrandByTypeId(String type);
}
