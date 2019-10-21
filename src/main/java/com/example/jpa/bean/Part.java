package com.example.jpa.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author EDZ
 * @date 2019/10/21
 */
@Entity
@Table(name = "part")
@Data
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String partname;



}
