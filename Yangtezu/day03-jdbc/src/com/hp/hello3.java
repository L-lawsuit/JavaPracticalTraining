package com.hp;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class hello3 {

    /*测试JdbcUtils中的queryList方法*/
    @Test
    public void test01(){
        List<dept> depts = JdbcUtils.queryList("select * from dept", dept.class);
        System.out.println(depts);

        List<emps> emps = JdbcUtils.queryList("select * from emps", emps.class);
        System.out.println(emps);
    }


    @Test
    public void test02(){
        String name = "'曹植'";
        List<emps> emps = JdbcUtils.queryList("select * from emps where name = " + name , emps.class);
        System.out.println(emps);


    }

}
