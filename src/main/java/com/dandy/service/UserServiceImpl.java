package com.dandy.service;

import com.dandy.dao.UserDao;
import com.dandy.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 李旦
 * @date 2020/3/3,10:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;


    @Override
    public User getUser(String username, String password) {
        return userDao.getUser(username,password);
    }

    @Override
    public User checkUser(String username) {
        return userDao.checkUser(username);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}