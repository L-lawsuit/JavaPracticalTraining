package com.hp.service;

import com.hp.domain.User;

public interface IUserService {
    //通过用户名查询用户
    User selectUserByName(String username);

    //添加注册用户
    int addUser(User registerUser);
}
