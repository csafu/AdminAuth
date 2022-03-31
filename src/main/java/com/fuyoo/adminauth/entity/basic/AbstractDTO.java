package com.fuyoo.adminauth.entity.basic;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

// Lambok 在JavaBean或类JavaBean中使用，这个注解包含范围最广，它包含getter、setter、
// NoArgsConstructor注解，即当使用当前注解时，会自动生成包含的所有方法；
@Data
// Lambok 在JavaBean或类JavaBean中使用，使用此注解会自动重写对应的equals方法和hashCode方法
@EqualsAndHashCode(callSuper = false)
// 一般实体类上会加@lombok注解代替@Getter,@Setter注解或者代替set，get方法，以及@ToString等注解即可，来显得代码简洁
// 这样就可以用链式访问，该注解设置为chain=true，生成setter方法返回this（也就是返回的是对象），代替了默认的返回void
@Accessors(chain = true)
public class AbstractDTO implements Serializable {
    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     */
    // serialVersionUID作用：
    // 序列化时为了保持版本的兼容性，即在版本升级时反序列化仍保持对象的唯一性。
    // 有两种生成方式：
    //   一个是默认的1L，比如：private static final long serialVersionUID = 1L;
    //   一个是根据类名、接口名、成员方法及属性等来生成一个64位的哈希字段，
    //      比如：private static final   long     serialVersionUID = xxxxL;
    private static final long serialVersionUID = 5088697673359856350L;


    //@Id          --用途不明
    //@GeneratedValue(strategy = GenerationType.IDENTITY)   -- 用途不明
    @TableId(type = IdType.AUTO)   //@TableId为Mybatis-plus专用的ID注解
    private long id;    //long 数据类型是 64 位、有符号的以二进制补码表示的整数；
    private Date createTime;    //创建时间
    private Date updateTime;    //更新时间
}
