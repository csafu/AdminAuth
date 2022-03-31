package com.fuyoo.adminauth.entity;

import com.fuyoo.adminauth.entity.basic.AbstractDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysRolePermission  extends AbstractDTO {
    private Long roleId;
    private Long resourcesId;
}
