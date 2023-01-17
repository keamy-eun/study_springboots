package com.study.study_springboots.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class HomeDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object getList() {
        String statement = "Home.selectFromANSWERSByQUESTIONS_UID";
        Map parameter = new HashMap();
        parameter.put("QUESTION_UID", "Q2");
        Object resultset = sqlSessionTemplate.selectList(statement, parameter);
        return resultset;
    }
}
    // HomeMapper는 Java가 호출 가능한 펑션이 아니기 때문에 SqlSessionTemplate라는 Class가 중간다리 역할하고 실행시켜준다.
    