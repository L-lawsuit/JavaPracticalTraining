package com.hp;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class hello1 {

    /*用jdbc来创建连接对象*/
    @Test
    public void test01(){

        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接对象
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yz?characterEncoding=utf-8&serverTimezone=UTC","root","root");

            System.out.println(cn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    /*采用连接池技术来创建连接对象*/
    @Test
    public void test02(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/yz?characterEncoding=utf-8&serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("root");

        DruidPooledConnection cn = null;
        try {
            cn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(cn);

    }
}
