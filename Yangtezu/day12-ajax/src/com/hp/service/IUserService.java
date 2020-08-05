package com.hp.service;

import com.hp.entity.User;

public interface IUserService {

    /**
     * 登录判断操作
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 注册用户
     * @param newUser
     * @return
     */
    int addUser(User newUser);
}
