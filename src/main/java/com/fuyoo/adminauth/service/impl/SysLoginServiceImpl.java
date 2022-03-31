package com.fuyoo.adminauth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.fuyoo.adminauth.entity.SysUser;
import com.fuyoo.adminauth.mapper.SysUserMapper;
import com.fuyoo.adminauth.service.ISysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLoginServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysLoginService {

    @Autowired
    private SysUserMapper sysUserMapper;

    //用户注册 添加用户
    @Override
    public int userRegister(SysUser sysUser) {
        return sysUserMapper.userRegister(sysUser);
    }
}
