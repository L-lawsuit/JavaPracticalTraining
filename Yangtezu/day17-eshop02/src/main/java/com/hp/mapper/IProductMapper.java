package com.hp.mapper;

import com.hp.domain.Product;
import com.hp.mapper.provider.ProductSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductMapper {

    @Select("SELECT *,s_product_type.id productTypeId,s_brand.id brandId FROM s_product LEFT JOIN s_product_type ON s_product.product_type = s_product_type.id LEFT JOIN s_brand ON s_product.product_brand = s_brand.id ORDER BY create_time DESC LIMIT 6")
    @Results(id = "product_type_brand", value = {
            @Result(column = "productTypeId", property = "productType.id"),
            @Result(column = "product_type_name", property = "productType.product_type_name"),
            @Result(column = "product_type_desc", property = "productType.product_type_desc"),
            @Result(column = "product_type_icon", property = "productType.product_type_icon"),
            @Result(column = "brandId", property = "productBrand.id"),
            @Result(column = "brand_name", property = "productBrand.brand_name"),
            @Result(column = "brand_type", property = "productBrand.brand_type"),
            @Result(column = "brand_img", property = "productBrand.brand_img")
    })
    List<Product> newProduct();


    @Select("SELECT\n" +
            "\ts_product.*,\n" +
            "\ts_product_type.*,\n" +
            "\ts_brand.*,\n" +
            "\ts_product_type.id productTypeId,\n" +
            "\ts_brand.id brandId,\n" +
            "\tSUM(s_order_product.product_num) num \n" +
            "FROM\n" +
            "\ts_product\n" +
            "\tLEFT JOIN s_product_type ON s_product.product_type = s_product_type.id\n" +
            "\tLEFT JOIN s_brand ON s_product.product_brand = s_brand.id\n" +
            "\tLEFT JOIN s_order_product ON s_product.id = s_order_product.product_id \n" +
            "GROUP BY\n" +
            "\ts_product.id\n" +
            "ORDER BY\n" +
            "\tnum DESC \n" +
            "\tLIMIT 0,6")
    @ResultMap("product_type_brand")
    List<Product> getRank();


    @Select("SELECT\n" +
            "\t* \n" +
            "FROM\n" +
            "\ts_product\n" +
            "\tLEFT JOIN s_product_type ON s_product.product_type = s_product_type.id\n" +
            "\tLEFT JOIN s_brand ON s_product.product_brand = s_brand.id \n" +
            "WHERE\n" +
            "\ts_product_type.product_type_name = #{typeName}\n" +
            "\t\n" +
            "\tLIMIT #{num}")
    @ResultMap("product_type_brand")
    List<Product> selectByTypeName(String typeName, int num);

    @SelectProvider(value = ProductSqlProvider.class,method = "getTypeSql")
    @ResultMap("product_type_brand")
    List<Product> selectProductByType(String type, String brands, String words);
}
