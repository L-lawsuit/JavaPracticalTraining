package com.hp;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.util.List;

public class hello4 {

    /*DBUtils简化操作*/
    @Test
    public void test01(){
        try {
            //初始化数据源
            DruidDataSource ds = new DruidDataSource();
            ds.setUrl("jdbc:mysql://localhost:3306/yz?characterEncoding=utf-8&serverTimezone=UTC");
            ds.setUsername("root");
            ds.setPassword("root");

            //创建QueryRunner对象
            QueryRunner queryRunner = new QueryRunner(ds);
            //查询dept表
            List<dept> deptsList = queryRunner.query("select * from dept", new BeanListHandler<dept>(dept.class));
            System.out.println(deptsList);

            //查询emps表
            List<emps> empsList = queryRunner.query("select * from emps", new BeanListHandler<emps>(emps.class));
            System.out.println(empsList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
