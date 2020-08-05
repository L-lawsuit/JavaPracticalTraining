package com.hp.dao.impl;

import com.hp.dao.IEmps;
import com.hp.entity.Emps;
import com.hp.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
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
}
