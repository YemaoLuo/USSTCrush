package com.cpb.domain;

/**
 * Author: cpb
 * Date: 2021/11/11 下午7:51
 */

public class user {

    private String name;
    private String email;

    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public user() {
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
