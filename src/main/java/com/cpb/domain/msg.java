package com.cpb.domain;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:38
 */

public class msg {

    private Boolean flag;
    private String message;

    public msg(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public msg() {
    }

    @Override
    public String toString() {
        return "msg{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                '}';
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
