package com.yiyuan.mapper;

import com.yiyuan.pojo.Chargeproject;
import com.yiyuan.pojo.ChargeprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeprojectMapper {
    long countByExample(ChargeprojectExample example);

    int deleteByExample(ChargeprojectExample example);

    int deleteByPrimaryKey(Integer cp_id);

    int insert(Chargeproject record);

    int insertSelective(Chargeproject record);

    List<Chargeproject> selectByExample(ChargeprojectExample example);

    Chargeproject selectByPrimaryKey(Integer cp_id);

    int updateByExampleSelective(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByExample(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByPrimaryKeySelective(Chargeproject record);

    int updateByPrimaryKey(Chargeproject record);
}