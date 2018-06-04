package me.macd.springbootdemo.model;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String salt;

    private Date createTime;

    private Date updateTime;

    private String status;

    public User(Integer id, String username, String password, String nickname, String salt, Date createTime, Date updateTime, String status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.salt = salt;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}