package com.fuyoo.adminauth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fuyoo.adminauth.entity.SysUser;
import org.apache.ibatis.annotations.Param;

//在对应的Mapper上继承基本的类BaseMapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    //所有的CURD已经编写完成
    //不需要想以前的配置一堆xml
    /**
     * 通过用户账号查询用户信息
     *
     * @param username
     * @return
     */
    public SysUser getUserByName(@Param("username") String username);
}
