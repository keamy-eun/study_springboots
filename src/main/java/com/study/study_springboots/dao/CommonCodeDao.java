package com.study.study_springboots.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonCodeDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    
    public Object getList(String statement, Object dataMap) {
        Object resultSet = sqlSessionTemplate.selectList(statement, dataMap);
        return resultSet;
    }

    public Object getOne(String sqlId, Object dataMap) {
        Object result = sqlSessionTemplate.selectOne(sqlId, dataMap);
        return result;
    }

}

