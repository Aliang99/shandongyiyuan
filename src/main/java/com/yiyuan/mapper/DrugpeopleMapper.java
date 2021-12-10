package com.yiyuan.mapper;

import com.yiyuan.pojo.Drugpeople;
import com.yiyuan.pojo.DrugpeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugpeopleMapper {
    long countByExample(DrugpeopleExample example);

    int deleteByExample(DrugpeopleExample example);

    int deleteByPrimaryKey(Integer drugP_id);

    int insert(Drugpeople record);

    int insertSelective(Drugpeople record);

    List<Drugpeople> selectByExample(DrugpeopleExample example);

    Drugpeople selectByPrimaryKey(Integer drugP_id);

    int updateByExampleSelective(@Param("record") Drugpeople record, @Param("example") DrugpeopleExample example);

    int updateByExample(@Param("record") Drugpeople record, @Param("example") DrugpeopleExample example);

    int updateByPrimaryKeySelective(Drugpeople record);

    int updateByPrimaryKey(Drugpeople record);
}