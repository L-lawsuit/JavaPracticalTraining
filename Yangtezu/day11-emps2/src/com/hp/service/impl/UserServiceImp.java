package com.hp.service.impl;

import com.hp.dao.IUser;
import com.hp.dao.impl.UserImp;
import com.hp.entity.User;
import com.hp.service.IUserService;

public class UserServiceImp implements IUserService {

    private IUser userImp = new UserImp();

    @Override
    public User login(User user) {

        return userImp.login(user);
    }

    @Override
    public int addUser(User newUser) {

        return userImp.addUser(newUser);
    }
}
