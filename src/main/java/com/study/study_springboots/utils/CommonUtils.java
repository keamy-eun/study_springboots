package com.study.study_springboots.utils;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public String getUniqueSeqence(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    // "src/main/resources/static/files/" -> root directory + 상대 경로
    public String getRelativeToAbsolutePath(String relativePath){
        // File.separator = linux(/) or window(\) 에 맞는 경로를 자동으로 정해줌
        String relativePathWithSeparator = relativePath.replace("/", File.separator);
        
        // 폴더의 절대 경로를 가져온다
        String absolutePath = new File(relativePathWithSeparator).getAbsolutePath() + File.separator;
        return absolutePath;
    }
}
