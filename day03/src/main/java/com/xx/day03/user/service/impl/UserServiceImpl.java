package com.xx.day03.user.service.impl;

import com.xx.day03.user.dao.UserDao;
import com.xx.day03.user.entity.User;
import com.xx.day03.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User test(String s) {
        System.out.println(s);
        return userDao.getUser(1);
    }
}