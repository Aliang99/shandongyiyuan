package com.yiyuan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiyuan.mapper.DoctorMapper;
import com.yiyuan.mapper.HosregisterMapper;
import com.yiyuan.mapper.KeshiMapper;
import com.yiyuan.mapper.XueliMapper;
import com.yiyuan.pojo.*;
import com.yiyuan.utils.AgeUtils;
import com.yiyuan.vo.DoctorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
    @Autowired
    private KeshiMapper keshiMapper;
    @Autowired
    private XueliMapper xueliMapper;
    @Autowired
    private HosregisterMapper hosregisterMapper;

    /**
     * 根据科室id,查询对应医生的集合
     * @param KID
     * @return
     */
    public List<Doctor> getDoctorByKID(Integer KID){
        DoctorExample example = new DoctorExample();
        example.createCriteria().andK_idEqualTo(KID);
        return mapper.selectByExample(example);
    }

    /**
     * 分页+条件查询医生信息
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    public PageInfo<Doctor> list(Integer pageNum, Integer pageSize, DoctorVo vo) {
        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();
        if (vo!=null){
            if (vo.getdId()!=null){
                criteria.andD_idEqualTo(vo.getdId());
            }
            if (vo.getdName()!=null && !"".equals(vo.getdName().trim())){
                criteria.andD_nameLike(vo.getdName());
            }
            if (vo.getkName()!=null && !"".equals(vo.getkName().trim())){
                KeshiExample keshiExample = new KeshiExample();
                keshiExample.createCriteria().andKeshi_nameEqualTo(vo.getkName());
                List<Keshi> keshis = keshiMapper.selectByExample(keshiExample);
                if (keshis.size()!=0){
                    criteria.andK_idEqualTo(keshis.get(0).getK_id());
                }else{
                    // 如果前端确实传了科室名称，但是数据库中没有相关科室，就返回空，在controller封装响应信息
                    return null;
                }
            }
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Doctor> doctors = mapper.selectByExample(example);
        PageInfo<Doctor> pageInfo = new PageInfo<>(doctors);
        for (Doctor doctor : pageInfo.getList()) {
            // 数据库中的数据为科室id,前端需要科室的中文名称，所以这里需要将中文名称set进去
            doctor.setkName(keshiMapper.selectByPrimaryKey(doctor.getK_id()).getKeshi_name());
        }
        return pageInfo;
    }

    /**
     * 根据医生的id,查询医生信息，并封装科室名称以及学历名称
     * @param dId
     * @return
     */
    public Doctor getDataById(Integer dId) {
        //根据id查询医生表，获取单个数据
        Doctor doctor = mapper.selectByPrimaryKey(dId);
        // 根据医生表查询的数据中，科室id获取中文名称
        Keshi keshi = keshiMapper.selectByPrimaryKey(doctor.getK_id());
        doctor.setkName(keshi.getKeshi_name());
        // 根据医生表查询的数据中，学历id获取学历名
        Xueli xueli = xueliMapper.selectByPrimaryKey(doctor.getX_id());
        doctor.setxName(xueli.getX_name());
        return doctor;
    }

    /**
     * 更新医生信息
     * @param doctor
     * @return
     * @throws Exception
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer updateDoctor(Doctor doctor) throws Exception {
        if (doctor.getD_age()==null || "".equals(doctor.getD_age())){
            //根据输入的出生年月日计算实际年龄
            doctor.setD_age(AgeUtils.getAge(doctor.getD_birthday()));
        }
        int update = mapper.updateByPrimaryKeySelective(doctor);
        return update;
    }

    public Integer addDoctor(Doctor doctor) throws Exception {

        //入职时间生成
        if (doctor.getD_inTime()==null){
            doctor.setD_inTime(new Date());
        }
        //入职状态默认0 正常
        if(doctor.getD_state()==null){
            doctor.setD_state(0);
        }
        //出生年月日推算年纪，如果没有输入出生年月日，就返回null
        if (doctor.getD_age()==null && doctor.getD_birthday()!=null){
            doctor.setD_age(AgeUtils.getAge(doctor.getD_birthday()));
        }else{
            return null;
        }
        int insert = mapper.insert(doctor);
        return insert;

    }
}
