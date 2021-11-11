package com.cpb.service.impl;

import com.cpb.domain.crush;
import com.cpb.domain.msg;
import com.cpb.mapper.crushMapper;
import com.cpb.service.crushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:50
 */

@Service
public class crushServiceImpl implements crushService {

    @Autowired
    private crushMapper crushMapper;

    @Override
    public msg insertCrush(crush crush) {
        msg msg = new msg(true, "添加成功");
        crushMapper.insertCrush(crush.getUname(), crush.getTname());
        return msg;
    }
}
