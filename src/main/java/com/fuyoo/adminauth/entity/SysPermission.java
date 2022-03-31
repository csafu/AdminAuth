package com.fuyoo.adminauth.entity;

import com.fuyoo.adminauth.entity.basic.AbstractDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 菜单权限表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysPermission extends AbstractDTO {
    private String name;        //菜单名称（接口名称）
    private String type;        //权限类型（0-一级菜单，1-子菜单，2-按钮权限
    private String url;         //url路径
    private String permission;  //菜单权限编码，例如：“sys:schedule:list,sys:schedule:info”,多个逗号隔开
    private Long parentId;      //父ID
    private Integer sort;       //排序号
    private Boolean external;   //是否外包连接
    private Boolean available;  //是否有效
    private String icon;        //菜单图标

    //@TableField(exist = false)
    //private String checked;
    //@TableField(exist = false)
    //private SysResources parent;
    //@TableField(exist = false)
    //private List<SysResources> nodes;
}
