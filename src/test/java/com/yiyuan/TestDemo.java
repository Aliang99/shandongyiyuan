package com.yiyuan;

import com.yiyuan.controller.DoctorController;
import com.yiyuan.mapper.DoctorMapper;
import com.yiyuan.pojo.Doctor;
import com.yiyuan.service.DoctorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestDemo {

    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private DoctorService service;

    /**
     * 测试是否可以连接上数据库。并查询到数据
     *  测试结果：ok
     */
    @Test
    public void test(){
        Doctor doctor = doctorMapper.selectByPrimaryKey(1);
        System.out.println(doctor);


    }
    @Test
    public void test2(){
        List<Doctor> doctorByKID = service.getDoctorByKID(15);
        Doctor doctor = doctorByKID.get(0);

        System.out.println(doctor);
    }
}
