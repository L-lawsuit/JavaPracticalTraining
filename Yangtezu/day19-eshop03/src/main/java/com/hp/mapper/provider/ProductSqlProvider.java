package com.hp.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class ProductSqlProvider {

    public String getTypeSql(String type, String brands, String words){

        String sql = new SQL(){{
            SELECT(" s_product.*,s_product_type.*,s_brand.*,s_product_type.id productTypeId,s_brand.id brandId,IFNULL(SUM(s_order_product.product_num),0) sale");
            FROM(" s_product");
            LEFT_OUTER_JOIN(" s_product_type ON s_product.product_type = s_product_type.id ");
            LEFT_OUTER_JOIN(" s_brand ON s_product.product_brand = s_brand.id ");
            LEFT_OUTER_JOIN(" s_order_product ON s_product.id = s_order_product.product_id ");
            GROUP_BY(" s_product.id");
            if (type != null && type.length() > 0){
                HAVING(" s_product.product_type=#{type}");
            }
            if (words != null && words.length() > 0){
                HAVING(" s_product.product_name like '%${words}%'");
            }
            if (brands != null && brands.length() > 0){
                String[] split = brands.split(",");
                StringBuilder sqlBrands = new StringBuilder(" s_brand.id in (");
                for (int i = 0; i < split.length; i++) {
                    sqlBrands.append("'").append(split[i]).append("'");
                    if (i < split.length-1){
                        sqlBrands.append(",");
                    }
                }
                sqlBrands.append(")");
                HAVING(sqlBrands.toString());
            }
        }}.toString();

        return sql;
    }
}
