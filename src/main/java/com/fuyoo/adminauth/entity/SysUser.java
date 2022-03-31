package com.fuyoo.adminauth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fuyoo.adminauth.entity.basic.AbstractDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser  extends AbstractDTO {
    private String username;
    private String password;
    private String nickname;    //昵称
    private String mobile;      //手机号
    private String email;       //电子邮件
    private String qq;          //QQ
    private Date   birthday;    //生日
    private Integer gender;     //性别
    private String avatar;      //头像图片连接
    private String userType;    //用户类型： 'ROOT'-具有超级权限，不需要赋值 'ADMIN'-管理员，需要设定权限 ‘’
    private String regIp;       //注册IP
    private String lastLoginIp; //最后登录时的IP
    private Date lastLoginTime; //最后登录时间
    private Integer loginCount; //登录次数
    private String remark;      //用户备注
    private Integer status;     //用户状态

}
