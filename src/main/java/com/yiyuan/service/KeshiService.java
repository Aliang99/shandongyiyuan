package com.yiyuan.service;

import com.yiyuan.mapper.KeshiMapper;
import com.yiyuan.pojo.Keshi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeshiService {
    @Autowired
    private KeshiMapper mapper;

    /**
     * 查询全部科室
     * @return
     */
    public List<Keshi> queryAll(){
        return mapper.selectByExample(null);
    }
}
