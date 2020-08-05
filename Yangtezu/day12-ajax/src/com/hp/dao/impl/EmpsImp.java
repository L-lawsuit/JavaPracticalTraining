package com.hp.dao.impl;

import com.hp.dao.IEmps;
import com.hp.entity.Emps;
import com.hp.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class EmpsImp implements IEmps {

    private QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());


    @Override
    public List<Emps> selectAll() {

        try {
             return qr.query("select * from emps",new BeanListHandler<Emps>(Emps.class));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public int deleteEmps(String id) {
        try {
            return qr.update("delete from emps where id = ?",id);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int addEmp(Emps emp) {
        try {
            return qr.update("insert into emps (name,age,sex,salary,dept_id) values (?,?,?,?,?)",emp.getName(),emp.getAge(),emp.getSex(),emp.getSalary(),emp.getDept_id());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Emps getEmpsByid(String id) {
        try {
            return qr.query("select * from emps where id = ?",new BeanHandler<Emps>(Emps.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int updateEmps(Emps emp) {
        try {
            return qr.update("update emps set name = ?,age = ?, sex = ?, salary = ?, dept_id = ? where id = ?",emp.getName(),emp.getAge(),emp.getSex(),emp.getSalary(),emp.getDept_id(),emp.getId());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<Emps> selectByName(String name) {

        try {
            String newName = name.trim();
            String sql = "select * from emps";
            if (!name.equals("")){
                sql += " where name like '%" + newName + "%'";
            }
            return qr.query(sql,new BeanListHandler<Emps>(Emps.class));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
