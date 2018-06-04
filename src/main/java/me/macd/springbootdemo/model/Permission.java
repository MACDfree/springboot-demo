package me.macd.springbootdemo.model;

import java.util.Date;

public class Permission {
    private Integer id;

    private String code;

    private String name;

    private Date createTime;

    private Date updateTime;

    private String status;

    public Permission(Integer id, String code, String name, Date createTime, Date updateTime, String status) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public Permission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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