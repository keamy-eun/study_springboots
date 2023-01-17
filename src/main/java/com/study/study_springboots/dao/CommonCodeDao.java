package com.study.study_springboots.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class CommonCodeDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    
    public Object getList() {
        String statement;
        statement = "CommonCode.selectCOMMON_CODE_ID,NAME,ORDER_NUMBER";
        Object resultSet = sqlSessionTemplate.selectList(statement);
        return resultSet;
    }
}
   