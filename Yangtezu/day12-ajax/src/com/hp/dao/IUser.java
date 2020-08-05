package com.hp.dao;

import com.hp.entity.User;

public interface IUser {

    /**
     * 进行user登录的判断
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 进行用户注册功能
     * @param newUser
     * @return
     */
    int addUser(User newUser);
}
