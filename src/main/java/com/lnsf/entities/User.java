package com.lnsf.entities;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class User {
    private Integer uid;

    private String username;

    private String password;

    private Date logintime;

    private Date loginouttime;

    private Integer power;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLoginouttime() {
        return loginouttime;
    }

    public void setLoginouttime(Date loginouttime) {
        this.loginouttime = loginouttime;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}