package com.hp.utils;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.DriverManager;

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


}
