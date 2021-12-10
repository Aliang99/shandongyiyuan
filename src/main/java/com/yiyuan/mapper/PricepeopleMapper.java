package com.yiyuan.mapper;

import com.yiyuan.pojo.Pricepeople;
import com.yiyuan.pojo.PricepeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PricepeopleMapper {
    long countByExample(PricepeopleExample example);

    int deleteByExample(PricepeopleExample example);

    int deleteByPrimaryKey(Integer priceP_id);

    int insert(Pricepeople record);

    int insertSelective(Pricepeople record);

    List<Pricepeople> selectByExample(PricepeopleExample example);

    Pricepeople selectByPrimaryKey(Integer priceP_id);

    int updateByExampleSelective(@Param("record") Pricepeople record, @Param("example") PricepeopleExample example);

    int updateByExample(@Param("record") Pricepeople record, @Param("example") PricepeopleExample example);

    int updateByPrimaryKeySelective(Pricepeople record);

    int updateByPrimaryKey(Pricepeople record);
}