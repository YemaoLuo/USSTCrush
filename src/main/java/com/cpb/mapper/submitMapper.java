package com.cpb.mapper;

import com.cpb.domain.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:39
 */

public interface submitMapper {

    @Insert("Insert into user values(#{name}, #{email})")
    public void insertUser(@Param("name") String name, @Param("email") String email);

    @Select("Select * from user where name = #{name} and email = #{email}")
    public user finduserByNameAndId(@Param("name") String name, @Param("email") String email);
}
