package me.macd.springbootdemo.model;

import java.util.Date;

public class RolePermission {
    private Integer id;

    private Integer roleId;

    private Integer permissionId;

    private Date createTime;

    private Date updateTime;

    private String status;

    public RolePermission(Integer id, Integer roleId, Integer permissionId, Date createTime, Date updateTime, String status) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public RolePermission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
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