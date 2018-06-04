package me.macd.springbootdemo.model;

import java.util.Date;

public class Role {
    private Integer id;

    private String role;

    private String description;

    private Date createTime;

    private Date updateTime;

    private String status;

    public Role(Integer id, String role, String description, Date createTime, Date updateTime, String status) {
        this.id = id;
        this.role = role;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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