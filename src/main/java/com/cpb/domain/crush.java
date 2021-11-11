package com.cpb.domain;

/**
 * Author: cpb
 * Date: 2021/11/11 下午7:51
 */

public class crush {

    private String uname;
    private String tname;

    public crush(String uname, String tname) {
        this.uname = uname;
        this.tname = tname;
    }

    public crush() {
    }

    @Override
    public String toString() {
        return "crush{" +
                "uname='" + uname + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

}
