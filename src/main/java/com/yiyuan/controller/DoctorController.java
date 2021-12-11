package com.yiyuan.controller;

import com.yiyuan.pojo.Doctor;
import com.yiyuan.service.DoctorService;
import com.yiyuan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用于处理门诊医生管理页面的CRUD
 *  1、新生信息查询（条件+分页）
 *  2、更改医生信息
 *  3、查看医生详细信息
 *  4、添加医生信息
 *  5、医生离职
 *  6、导出为excel
 */
@Controller
@RequestMapping("doctor")
@ResponseBody
public class DoctorController {

    @Autowired
    private DoctorService service;

    @RequestMapping(value = "queryByKID/{KID}",method = RequestMethod.GET)
    public ResultVo<Doctor> getDoctorByKID(@PathVariable("KID") Integer KID){

        List<Doctor> doctorByKID = service.getDoctorByKID(KID);
        return new ResultVo<Doctor>(doctorByKID);
    }
}
