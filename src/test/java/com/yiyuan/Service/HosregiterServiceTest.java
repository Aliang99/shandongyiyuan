package com.yiyuan.Service;

import com.github.pagehelper.PageInfo;
import com.yiyuan.pojo.Hosregister;
import com.yiyuan.service.HosregisterService;
import com.yiyuan.vo.HosregisterVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class HosregiterServiceTest {

    @Autowired
    private HosregisterService service;

    /**
     * 测试内容：挂号service的分页+条件查询
     * 测试结果：OK
     */
    @Test
    public void testList() throws ParseException {
        HosregisterVo hosregisterVo = new HosregisterVo();
        hosregisterVo.setdName("张医生");
        //hosregisterVo.setKeshiName("神经内一科");
        hosregisterVo.setBeginTime(new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-12"));
        hosregisterVo.setEndTime(new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-22"));
        PageInfo<Hosregister> list = service.list(1, 3, hosregisterVo);
        System.out.println(list.toString());
    }
}
