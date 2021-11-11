package com.cpb.domain;

/**
 * Author: cpb
 * Date: 2021/11/11 下午7:51
 */

public class crush {

    private String uname;
    private String tname;

    private Boolean checked;

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

    public crush(String uname, String tname, Boolean checked) {
        this.uname = uname;
        this.tname = tname;
        this.checked = checked;
    }

    public crush() {
    }

    @Override
    public String toString() {
        return "crush{" +
                "uname='" + uname + '\'' +
                ", tname='" + tname + '\'' +
                ", checked=" + checked +
                '}';
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }


}
