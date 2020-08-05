package com.hp.dao.impl;

import com.hp.dao.IUser;
import com.hp.entity.User;
import com.hp.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserImp implements IUser {

    private QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());


    @Override
    public User login(User user) {

        try {
            return qr.query("select * from user where username = ? and password = ?", new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }


    }

    @Override
    public int addUser(User newUser) {

        try {
            return qr.update("insert into user (username,password) values (?,?)", newUser.getUsername(), newUser.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

    }
}
