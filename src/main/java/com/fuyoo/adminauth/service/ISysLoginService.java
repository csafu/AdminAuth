package com.fuyoo.adminauth.service;


import com.fuyoo.adminauth.entity.SysUser;

public interface ISysLoginService {
    //用户注册 添加用户
    int userRegister(SysUser sysUser);
}
