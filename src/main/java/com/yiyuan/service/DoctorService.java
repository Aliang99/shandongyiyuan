package com.yiyuan.service;

import com.yiyuan.mapper.DoctorMapper;
import com.yiyuan.pojo.Doctor;
import com.yiyuan.pojo.DoctorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用于处理门诊医生Controller的功能点
 *  1、新生信息查询（条件+分页）
 *  2、更改医生信息
 *  3、查看医生详细信息
 *  4、添加医生信息
 *  5、医生离职
 *  6、导出为excel
 */
@Service
public class DoctorService {
    @Autowired
    private DoctorMapper mapper;

    public List<Doctor> getDoctorByKID(Integer KID){
        DoctorExample example = new DoctorExample();
        example.createCriteria().andK_idEqualTo(KID);
        return mapper.selectByExample(example);
    }
}
