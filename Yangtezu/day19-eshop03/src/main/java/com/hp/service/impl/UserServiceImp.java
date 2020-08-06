package com.hp.service.impl;

import com.hp.domain.User;
import com.hp.mapper.IUserMapper;
import com.hp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public User selectUserByName(String username) {
        return userMapper.selectUserByName(username);
    }

    @Override
    public int addUser(User registerUser) {
        return userMapper.addUser(registerUser);
    }
}
