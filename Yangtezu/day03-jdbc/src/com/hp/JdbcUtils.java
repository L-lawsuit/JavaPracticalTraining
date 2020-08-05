package com.hp;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtils {

    private static Connection cn;
    static {

        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取连接对象
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yz?characterEncoding=utf-8&serverTimezone=UTC","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static <T> List<T> queryList(String sql,Class<T> c){

        try {

            //获取预处理对象
            PreparedStatement ps = cn.prepareStatement(sql);
            //执行sql语句
            ResultSet resultSet = ps.executeQuery();

            //得到元数据
            ResultSetMetaData metaData = resultSet.getMetaData();

            //总列数
            int columnCount = metaData.getColumnCount();

            //创建返回集list对象
            List<T> arrayList = new ArrayList<>();
            //循环添加到list中
            while (resultSet.next()){
                //创建实体类对象
                T t = c.newInstance();
                for (int i = 1 ; i <= columnCount; i++){
                    //得到单元格数据
                    Object value = resultSet.getObject(i);
                    //得到列名，和实体类属性一致
                    String columnName = metaData.getColumnName(i);
                    //创建Field对象，并使得f具有操纵类属性的权限
                    Field f = c.getDeclaredField(columnName);
                    f.setAccessible(true);
                    //设置属性值
                    f.set(t,value);

                }
                //添加数据
                arrayList.add(t);
            }
            return arrayList;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
