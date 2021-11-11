package com.cpb.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:49
 */

public interface crushMapper {

    @Insert("Insert into crush values(#{uname}, #{tname})")
    public void insertCrush(@Param("uname") String uname, @Param("tname") String tname);
}
