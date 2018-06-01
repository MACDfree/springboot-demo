create database `sbdemo` default character set utf8mb4 collate utf8mb4_general_ci;

DROP TABLE IF EXISTS `sys_user`;
create table sys_user
(
  id int auto_increment primary key,
  username nvarchar(100) not null comment '用户名',
  password varchar(100) not null comment '密码',
  nickname nvarchar(100) null comment '昵称',
  salt varchar(50) not null comment '盐',
  create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间',
  status varchar(1) default '1' null comment '用户状态 1 有效 0 无效 9 禁用'
) engine=InnoDB comment '用户表' charset = utf8;

DROP TABLE IF EXISTS `sys_role`;
create table sys_role
(
  id int auto_increment primary key,
  role nvarchar(100) not null comment '角色名称',
  description nvarchar(500) not null comment '角色描述',
  create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间',
  status varchar(1) default '1' null comment '角色状态 1 有效 0 无效 9 禁用'
) engine=InnoDB comment '角色表' charset = utf8;

DROP TABLE IF EXISTS `sys_permission`;
create table sys_permission
(
  id int auto_increment primary key,
  `code` nvarchar(100) not null comment '权限编码',
  `name` nvarchar(500) not null comment '权限名称',
  create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间',
  status varchar(1) default '1' null comment '角色状态 1 有效 0 无效 9 禁用'
) engine=InnoDB comment '权限表' charset = utf8;

DROP TABLE IF EXISTS `sys_user_role`;
create table sys_user_role
(
  id int auto_increment primary key,
  role_id int default null comment '角色ID',
  user_id int default null comment '用户ID',
  create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间',
  status varchar(1) default '1' null comment '角色状态 1 有效 0 无效 9 禁用'
) engine=InnoDB comment '用户角色关系表' charset = utf8;

DROP TABLE IF EXISTS `sys_role_permission`;
create table sys_role_permission
(
  id int auto_increment primary key,
  role_id int default null comment '角色ID',
  permission_id int default null comment '权限ID',
  create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间',
  status varchar(1) default '1' null comment '角色状态 1 有效 0 无效 9 禁用'
) engine=InnoDB comment '角色权限关系表' charset = utf8;

