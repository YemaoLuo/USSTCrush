package com.cpb.service;

import com.cpb.domain.msg;
import com.cpb.domain.user;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:43
 */

public interface submitService {

    public msg insertUser(user user);

    public msg checkUserExist(user user);
}
