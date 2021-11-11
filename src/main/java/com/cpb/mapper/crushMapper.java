package com.cpb.mapper;

import com.cpb.domain.crush;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Author: cpb
 * Date: 2021/11/11 下午8:49
 */

public interface crushMapper {

    @Insert("Insert into crush values(#{uname}, #{tname}, #{checked})")
    public void insertCrush(@Param("uname") String uname, @Param("tname") String tname, @Param("checked") Boolean checked);

    @Select("Select * from crush where uname = #{tname} and tname = #{uname}")
    public crush findCrush(@Param("uname") String uname, @Param("tname") String tname);

    @Update("Update crush set checked = 1 where uname = #{uname}")
    public void updateCrushChecked(@Param("uname") String uname);
}
