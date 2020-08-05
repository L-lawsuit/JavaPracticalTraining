package com.hp.service.impl;

import com.hp.dao.IUser;
import com.hp.dao.impl.UserImp;
import com.hp.entity.User;

public class UserService {

    private IUser userImp = new UserImp();

    public User login(User user) {

        return userImp.login(user);
    }

    public int addUser(User newUser) {

        return userImp.addUser(newUser);
    }
}
