package com.example.jpa.dao;

import com.example.jpa.bean.User;
import com.example.jpa.bean.UserPortDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author EDZ
 * @date 2019/10/16
 */

@Component
public interface UserDao extends JpaRepository<User,Long> {
    /*
    * jpaRepository已经有很多现场的方法了
    * */

    User save(User user);

    List<User> findByName(String name);

    @Query(value = "delete from user where id=?",nativeQuery = true)
    void deleteByUserId(Long userId);

    @Query(value = "select u.id,u.name,p.partname from user u right join part p on u.id=p.pid ",nativeQuery = true)
    public List<UserPortDao> findViewInfo();

}








