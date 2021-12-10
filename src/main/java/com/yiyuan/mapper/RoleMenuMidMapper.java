package com.yiyuan.mapper;

import com.yiyuan.pojo.RoleMenuMid;
import com.yiyuan.pojo.RoleMenuMidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMidMapper {
    long countByExample(RoleMenuMidExample example);

    int deleteByExample(RoleMenuMidExample example);

    int deleteByPrimaryKey(Integer role_menu_mid_id);

    int insert(RoleMenuMid record);

    int insertSelective(RoleMenuMid record);

    List<RoleMenuMid> selectByExample(RoleMenuMidExample example);

    RoleMenuMid selectByPrimaryKey(Integer role_menu_mid_id);

    int updateByExampleSelective(@Param("record") RoleMenuMid record, @Param("example") RoleMenuMidExample example);

    int updateByExample(@Param("record") RoleMenuMid record, @Param("example") RoleMenuMidExample example);

    int updateByPrimaryKeySelective(RoleMenuMid record);

    int updateByPrimaryKey(RoleMenuMid record);
}