package com.fuyoo.adminauth.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fuyoo.adminauth.entity.basic.AbstractDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysRole extends AbstractDTO {
    private String name;
    private String description;
    private Boolean available;

    //@Transient   // @Transient 表示该属性并非一个到数据库表的字段的映射, 基于hibenate的使用方式
    @TableField(exist = false)   //
    private Integer selected;

}
