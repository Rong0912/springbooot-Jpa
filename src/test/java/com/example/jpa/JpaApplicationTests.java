package com.example.jpa;

import com.example.jpa.bean.UserPortDao;
import com.example.jpa.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void contextLoads() {
        /*                                           */

        List<UserPortDao> viewInfos=userDao.findViewInfo();
        for(UserPortDao viewInfo:viewInfos){
            System.out.println(viewInfo.getName()+viewInfo.getPartname()+viewInfo.getId()+"   "+ viewInfo.getId());
        }
    }

}
