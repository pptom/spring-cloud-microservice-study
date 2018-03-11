package com.itmuch.cloud.study.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: Mr Tom
 * @date: 2018/3/10
 * @since: 2018/3/10
 * @email: ptomjie@gmail.com
 * @description:
 */
@Entity
public class User implements Serializable{
    private static final long serialVersionUID = 2036127357867298520L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
