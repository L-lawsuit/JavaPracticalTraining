package com.hp;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;
import java.util.List;

public class hello2 {

    private static Connection cn;
    @Before
    public void init(){
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接对象
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yz?characterEncoding=utf-8&serverTimezone=UTC","root","root");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /*测试插入数据*/
    @Test
    public void test01(){
        String sql = new String("insert into dept values (null,?,?)");

        try {
            //获得预对象
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1,"会议部");
            ps.setString(2,"光谷软件园D6栋");
            //执行插入语句
            int row = ps.executeUpdate();
            System.out.println("受影响的行数：" + row);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*删除一行数据*/
    @Test
    public void test02(){

        String sql = new String("delete from dept where did = ?");
        try {
            //获得预对象
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1,2);

            //执行
            int row = ps.executeUpdate();
            System.out.println("受影响的行数：" + row);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*修改其中数据*/
    @Test
    public void test03(){
        String sql = new String("update dept set dname = ? where did = 7");
        try {
            //获得预对象
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1,"后勤部2");

            //执行
            int row = ps.executeUpdate();
            System.out.println("受影响的行数：" + row);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /*查询数据*/
    @Test
    public void test04(){
        String sql = new String("select * from dept");
        try {
            //获得预对象
            PreparedStatement ps = cn.prepareStatement(sql);

            //执行
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);

                System.out.println(id + "--" + name + "--" + location);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
