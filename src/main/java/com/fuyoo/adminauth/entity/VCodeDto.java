package com.fuyoo.adminauth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VCodeDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private String id;

    @TableField("ipAddress")
    private String ipAddress;

    @TableField("vCode")
    private String vCode;

    /**
     * 使用 @TableField(exist = false) ，表示该字段在数据库中不存在 ，所以不会插入到数据库中
     * 使用 transient 、 static 修饰的属性也不会插入数据库中
     */
    @TableField(exist = false)
    private String createTime;
}