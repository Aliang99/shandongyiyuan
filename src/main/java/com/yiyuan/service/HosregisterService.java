package com.yiyuan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiyuan.mapper.DoctorMapper;
import com.yiyuan.mapper.HosregisterMapper;
import com.yiyuan.mapper.KeshiMapper;
import com.yiyuan.pojo.*;
import com.yiyuan.vo.HosregisterVo;
import com.yiyuan.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 用于处理挂号controller的功能点
 *  *  1、分页+条件查询
 *  2、门诊挂号
 *  3、新退号
 *  4、修改挂号信息
 *  5、查询挂号详情
 *  6、导出为excel
 */
@Service
public class HosregisterService {

    @Autowired
    private HosregisterMapper hosregisterMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private KeshiMapper keshiMapper;


    /**
     * 获取分页+条件数据
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    public PageInfo<Hosregister> list(Integer pageNum, Integer pageSize, HosregisterVo vo){

        HosregisterExample hosregisterExample = new HosregisterExample();
        HosregisterExample.Criteria hosregisterExampleCriteria = hosregisterExample.createCriteria();
        if (vo!=null){
            //加入病历号条件
            if (vo.getHosRId()!=null){
                hosregisterExampleCriteria.andHosR_idEqualTo(vo.getHosRId());
            }
            //加入医生条件
            if (vo.getdName()!=null &&!"".equals(vo.getdName().trim())) {
                // 获取医生的中文名
                String doctorName = vo.getdName();
                // 根据医生的姓名，查询医生的id
                DoctorExample doctorExample = new DoctorExample();
                doctorExample.createCriteria().andD_nameEqualTo(doctorName);
                List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
                // 如果查询到该名字对应的医生，就将这个医生的id作为参数，传入hosregisterExampleCriteria
                if (doctors.size() !=0) {
                    /*
                    对于医生重名的问题来说，
                    在录入医生的信息时，如果发现数据库中有重名的，
                    需要将该医生的名字后面加上编号，用于区分
                    此处不做特殊处理
                    */
                    hosregisterExampleCriteria.andD_idEqualTo(doctors.get(0).getD_id());
                }
            }
            //加入科室时间
            if (vo.getKeshiName()!=null && !"".equals(vo.getKeshiName().trim())){
                //获取科室的中文名
                String keshiName = vo.getKeshiName();
                //根据科室的中文名,查询科室id
                KeshiExample keshiExample = new KeshiExample();
                keshiExample.createCriteria().andKeshi_nameEqualTo(vo.getKeshiName());
                List<Keshi> keshis = keshiMapper.selectByExample(keshiExample);
                if (keshis.size()!=0){
                    hosregisterExampleCriteria.andK_idEqualTo(keshis.get(0).getK_id());
                }
            }
            //加入开始时间
            if (vo.getBeginTime()!=null){
                hosregisterExampleCriteria.andHosR_timeGreaterThanOrEqualTo(vo.getBeginTime());
            }
            //加入结束时间
            if (vo.getEndTime()!=null){
                hosregisterExampleCriteria.andHosR_timeLessThanOrEqualTo(vo.getEndTime());
            }
        }
        hosregisterExample.setOrderByClause("hosR_state");
        //获取分页数据
        PageHelper.startPage(pageNum,pageSize);
        //条件准备之后，查询数据库
        List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
        //将查询的结果放到分页对象中
        PageInfo<Hosregister> pageInfo = new PageInfo<>(hosregisters);
        //将分页对象中的科室id以及医生id，查询数据库后获取中文名
        pageInfo.getList().forEach(hosregister -> {
            Doctor doctor = doctorMapper.selectByPrimaryKey(hosregister.getD_id());
            if (doctor==null)
                hosregister.setD_Name("未指定医生");
            else
                hosregister.setD_Name(doctor.getD_name());
            Keshi keshi = keshiMapper.selectByPrimaryKey(hosregister.getK_id());
            if (keshi==null)
                hosregister.setK_Name("未指定科室");
            else
                hosregister.setK_Name(keshi.getKeshi_name());
        });
        return pageInfo;
    }

    /**
     * 根据id查询挂号信息，并将表中关联其它表的id的信息中的姓名，查出来放到查询结果中
     * @param hosrId
     * @return
     */
    public Hosregister getDataById(Integer hosrId) {
        //根据id查询挂号表，获取单个数据
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(hosrId);
        // 根据挂号表查询的数据中，科室id获取中文名称
        Keshi keshi = keshiMapper.selectByPrimaryKey(hosregister.getK_id());
        hosregister.setK_Name(keshi.getKeshi_name());
        // 根据挂号表查询的数据中，医生id获取医生姓名
        Doctor doctor = doctorMapper.selectByPrimaryKey(hosregister.getD_id());
        hosregister.setD_Name(doctor.getD_name());
        return hosregister;
    }

    /**
     * 添加挂号信息
     * @param hosregister
     * @return
     */
    public Integer addhosregister(Hosregister hosregister){
        hosregister.setHosR_time(new Date()); //挂号时间
        hosregister.setHosR_state(0);//挂号状态
        if ("".equals(hosregister.getHosR_work().trim())){
            hosregister.setHosR_work("无工作");
        }
        int insert = hosregisterMapper.insert(hosregister);
        return insert;
    }

    /**
     * 更新挂号信息
     * @param hosregister
     * @return
     */
    public Integer updatehosregister(Hosregister hosregister){
        if ("".equals(hosregister.getHosR_work().trim())){
            hosregister.setHosR_work("无工作");
        }
        int update = hosregisterMapper.updateByPrimaryKeySelective(hosregister);
        return update;
    }

    /**
     * 退号
     * @param id
     * @return
     */
    public Integer delhosregister(Integer id){

        Hosregister hosregister = new Hosregister();
        hosregister.setHosR_state(3); //状态码为3 表示退号
        HosregisterExample example = new HosregisterExample();
        example.createCriteria().andHosR_idEqualTo(id);
        int update = hosregisterMapper.updateByExampleSelective(hosregister, example);
        return update;
    }
}
