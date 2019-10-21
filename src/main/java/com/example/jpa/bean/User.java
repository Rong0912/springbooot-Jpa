package com.example.jpa.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author EDZ
 * @date 2019/10/16
 */
@Data
@Entity   //该注解声明一个实体类，与数据库中的表名对应
public class User {
    @Id       //表明id
    @GeneratedValue  //自动生成
    private Long id;
    private String name;

}
