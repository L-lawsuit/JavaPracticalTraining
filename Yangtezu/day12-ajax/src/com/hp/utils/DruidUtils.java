package com.hp.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;


public class DruidUtils {

    private static DruidDataSource ds;
    static {
        ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/yz?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("root");

    }

    public static DruidDataSource getDataSource(){

        return ds;
    }

    public static <T> T mapToBean(Class<T> c, Map<String, ?> map){
        try {
            T t = c.newInstance();

            BeanUtils.populate(t,map);

            return t;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}
