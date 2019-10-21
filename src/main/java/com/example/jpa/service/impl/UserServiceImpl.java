package com.example.jpa.service.impl;

import com.example.jpa.bean.User;
import com.example.jpa.dao.UserDao;
import com.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author EDZ
 * @date 2019/10/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void deleteAllInBatch() {
        userDao.deleteAllInBatch();
    }


    @Override
    public int saveUser(User user) {
        return 0;
    }

    @Override
    public void deleteUser(Long userId) {
        userDao.deleteByUserId(userId);
    }
}
