package com.study.study_springboots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.study_springboots.dao.CommonCodeDao;



@Service
public class CommonCodeService {
    
    @Autowired
    CommonCodeDao commonCodeDao;

    public Object getList(Object dataMap){
        String statement = "CommonCode.selectFromCIP_COMMON_CODE";
        Object result = commonCodeDao.getList(statement, dataMap);
        return result;
    }

    public Object getOne(Object dataMap){
        String sqlId = "CommonCode.selectFromCIP_COMMON_CODEByUID";
        Object result = commonCodeDao.getOne(sqlId, dataMap);
        return result;
    }

}
