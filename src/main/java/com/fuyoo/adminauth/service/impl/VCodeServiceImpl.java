package com.fuyoo.adminauth.service.impl;

import com.fuyoo.libadminauth.service.IVCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VCodeServiceImpl extends ServiceImpl<VCodeMapper, VCodeDto> implements IVCodeService {

    @Autowired
    private VCodeMapper vCodeMapper;

//    @Autowired
//    private VCodeDto vCodeDto;

    @Override
    public int insertVCode(VCodeDto vCodeDto){
        return vCodeMapper.insertVCode(vCodeDto);
    }

    //通过ip查询
    public List<VCodeDto> getVCode(String ipAddress) {

        List <VCodeDto>  vcodeArr = vCodeMapper.getVCode(ipAddress);
        return vcodeArr;
    }
}
