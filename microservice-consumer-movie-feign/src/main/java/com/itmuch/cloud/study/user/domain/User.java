package com.itmuch.cloud.study.user.domain;

/**
 * @author Mr Tom
 * @date 2018/3/14
 * @email ptomjie@gmail.com
 * @description
 * @since 2018/3/14
 */
public class User {
    private Long id;
    private String username;
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
