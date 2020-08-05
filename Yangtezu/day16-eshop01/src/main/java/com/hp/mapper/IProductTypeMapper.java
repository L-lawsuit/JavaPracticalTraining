package com.hp.mapper;

import com.hp.domain.ProductType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductTypeMapper {

    @Select("select * from s_product_type")
    List<ProductType> selectAll();
}
