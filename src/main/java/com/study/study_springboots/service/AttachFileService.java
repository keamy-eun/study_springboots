package com.study.study_springboots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.study_springboots.dao.AttachFileDao;



@Service
public class AttachFileService {
    
    @Autowired
    AttachFileDao attachFileDao;

    public Object deleteAndGetList(Object dataMap){
        Object result = this.delete(dataMap);
        result = this.getList(dataMap);
        return result;
    }
    
    public Object insertWithFilesAndGetList(Object dataMap){
        // insert files
        Object result = this.insertOne(dataMap);
        result = this.getList(dataMap);
        return result;
    }
    
    public Object getList(Object dataMap){
        String sqlMapId = "AttachFile.selectListByUID";
        Object result = attachFileDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Object getOne(Object dataMap){
        String sqlMapId = "AttachFile.selectByUID";

        Object result = attachFileDao.getOne(sqlMapId, dataMap);
        return result;
    }

    public Object updateOne(Object dataMap){
        String sqlMapId = "AttachFile.updateByUID";

        Object result = attachFileDao.update(sqlMapId, dataMap);
        return result;    
    }

    public Object insertOne(Object dataMap){
        String sqlMapId = "AttachFile.insertWithUID";

        Object result = attachFileDao.insert(sqlMapId, dataMap);
        return result;    
    }

    public Object insertMulti(Object dataMap){
        String sqlMapId = "AttachFile.insertMulti";

        Object result = attachFileDao.insert(sqlMapId, dataMap);
        return result;    
    }

    public Object delete(Object dataMap){
        String sqlMapId = "AttachFile.deleteByUID";

        Object result = attachFileDao.delete(sqlMapId, dataMap);
        return result;    
    }

    public Object deleteMulti(Object dataMap){
        String sqlMapId = "AttachFile.deleteMultiByUIDs";

        Object result = attachFileDao.delete(sqlMapId, dataMap);
        return result;    
    }
}
