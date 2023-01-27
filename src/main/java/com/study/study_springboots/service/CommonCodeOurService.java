package com.study.study_springboots.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.study_springboots.dao.CommonCodeOurDao;

@Service
public class CommonCodeOurService {
    @Autowired
    CommonCodeOurDao commonCodeOurDao;
    
    @Autowired
    AttachFileService attachFileService;

    // dataMap 은 사용자가 controller로 넘겨주기 때문에 파람으로 설정한다.
    public Object getList(Object dataMap){
        String sqlMapId = "CommonCodeOur.selectListByUID";
        Object result = commonCodeOurDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Object getOne(Object dataMap){
        String sqlMapId = "CommonCodeOur.selectByUID";
        Object result = commonCodeOurDao.getOne(sqlMapId, dataMap);
        return result;
    }

    public Object updateOne(Object dataMap){
        String sqlMapId = "CommonCodeOur.updateByUID";
        Object result = commonCodeOurDao.updateOne(sqlMapId, dataMap);
        return result;
    }
    
    public Object delete(Object dataMap){
        String sqlMapId = "CommonCodeOur.deleteByUID";
        Object result = commonCodeOurDao.delete(sqlMapId, dataMap);
        return result;
    }
    
    public Object insertOne(Object dataMap){
        String sqlMapId = "CommonCodeOur.insertWithUID";
        Object result = commonCodeOurDao.insert(sqlMapId, dataMap);
        return result;
    }

    public Object deleteAndGetList(Object dataMap){
        Object result = this.delete(dataMap);
        result = this.getList(dataMap);
        return result;
    }

    public Object updateAndGetList(Object dataMap){
        Object result = this.updateOne(dataMap);
        result = this.getList(dataMap);
        return result;
    }

    public Object deleteMulti(Object dataMap){
        String sqlMapId = "CommonCodeOur.deleteMultiByUIDs";
        Object result = commonCodeOurDao.delete(sqlMapId, dataMap);
        return result;
    }

    public Object deleteMultiAndList(Object dataMap){
        Object result = this.deleteMulti(dataMap);
        result = this.getList(dataMap);
        return result;
    }
    
    public Object insertWithFilesAndGetList(Object dataMap){
        // insert files
        Object result = attachFileService.insertMulti(dataMap);
        result = this.insertOne(dataMap);
        result = this.getList(dataMap);
        return result;
    }

    public Object getOneWithAttachFiles(Object dataMap){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("attachFiles", attachFileService.getList(dataMap));

        // 기존 값 보존을 위해 사용
        result.putAll((Map<String, Object>)this.getOne(dataMap));
        return result;
    }
}