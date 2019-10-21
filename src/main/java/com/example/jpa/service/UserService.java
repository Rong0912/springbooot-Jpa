package com.example.jpa.service;

import com.example.jpa.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author EDZ
 * @date 2019/10/16
 */
public interface UserService {
    List<User> findAll();
    void deleteAllInBatch();//删除所有
    int saveUser(User user);
    void deleteUser(Long userId);
}
