package com.fuyoo.adminauth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fuyoo.adminauth.entity.VCodeDto;

import java.util.List;

public interface IVCodeService extends IService<VCodeDto> {
    public int insertVCode(VCodeDto vCodeDto);

    public List<VCodeDto> getVCode(String ipAddress);
}
