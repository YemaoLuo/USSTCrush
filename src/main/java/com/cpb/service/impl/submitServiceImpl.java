package com.cpb.service.impl;

import com.cpb.domain.msg;
import com.cpb.domain.user;
import com.cpb.mapper.submitMapper;
import com.cpb.service.submitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:43
 */

@Service
public class submitServiceImpl implements submitService {

    @Autowired
    private submitMapper submitMapper;

    @Override
    public msg insertUser(user user) {
        msg msg = new msg(true, "提交成功");
        submitMapper.insertUser(user.getName(), user.getEmail());
        return msg;
    }

    @Override
    public msg checkUserExist(user user) {
        msg msg = new msg();
        user userFound = submitMapper.finduserByNameAndId(user.getName(), user.getEmail());
        if (userFound == null) {
            msg.setFlag(true);
            return msg;
        }
        msg.setFlag(false);
        msg.setMessage("每人仅有一次机会哦");
        return msg;
    }
}
