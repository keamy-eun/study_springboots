package com.study.study_springboots.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.service.CommonCodeOurService;
import com.study.study_springboots.utils.CommonUtils;

@Controller
@RequestMapping(value = "/commonCodeOur")
public class CommonCodeOurController {

    @Autowired
    CommonCodeOurService commonCodeOurService;

    @Autowired
    CommonUtils commonUtils;

    @RequestMapping(value = {"/list", "/", ""}, method = RequestMethod.GET)
    public ModelAndView list(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        Object resultMap = commonCodeOurService.getList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }
    
    @RequestMapping(value = {"/edit/{uniqueId}"}, method = RequestMethod.GET)
    public ModelAndView edit(@RequestParam Map<String, Object> params, @PathVariable String uniqueId, ModelAndView modelAndView) {
        params.put("COMMON_CODE_ID",uniqueId);
        Object resultMap = commonCodeOurService.getOne(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/edit");
        return modelAndView;
    }
    
    @RequestMapping(value = {"/editMulti/{uniqueId}"}, method = RequestMethod.GET)
    public ModelAndView editMulti(@RequestParam Map<String, Object> params, @PathVariable String uniqueId, ModelAndView modelAndView) {
        params.put("COMMON_CODE_ID",uniqueId);
        params.put("SOURCE_UNIQUE_SEQ",uniqueId);
        Object resultMap = commonCodeOurService.getOneWithAttachFiles(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/editMulti");
        return modelAndView;
    }
        
    @RequestMapping(value = {"/update"}, method = RequestMethod.POST)
    public ModelAndView update(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        commonCodeOurService.updateAndGetList(params);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }
        
    @RequestMapping(value = {"/updateMulti"}, method = RequestMethod.POST)
    public ModelAndView updateMulti(MultipartHttpServletRequest multipartHttpServletRequest, @RequestParam Map<String, Object> params, ModelAndView modelAndView) throws IOException {
        Iterator<String> fileNames =  multipartHttpServletRequest.getFileNames();
        
        while(fileNames.hasNext()){
            String value = (String)params.get(fileNames.next());
            System.out.println(value);
            if(value != null){ //null이 아니면 originalFileName이 있는지 확인

            }
        }

        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }
    
    @RequestMapping(value = {"/delete/{uniqueId}"}, method = RequestMethod.POST)
    public ModelAndView delete(@RequestParam Map<String, Object> params, @PathVariable String uniqueId, ModelAndView modelAndView) {
        params.put("COMMON_CODE_ID",uniqueId);
        Object resultMap = commonCodeOurService.deleteAndGetList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }
        
    @RequestMapping(value = {"/form"}, method = RequestMethod.GET)
    public ModelAndView form(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        modelAndView.setViewName("commonCode_our/edit");
        return modelAndView;
    }

    @RequestMapping(value = {"/insert"}, method = RequestMethod.POST)
    public ModelAndView insert(MultipartHttpServletRequest multipartHttpServletRequest, @RequestParam Map<String, Object> params, ModelAndView modelAndView) throws IOException {
        String register_seq = multipartHttpServletRequest.getParameter("REGISTER_SEQ");
        MultipartFile multipartFile= multipartHttpServletRequest.getFile("file_first");
        String fileName = multipartFile.getOriginalFilename();
        String relativePath = "src\\main\\resources\\static\\files\\";
        // file에 저장
        // fileName과 relativePath를 합성하여 byte로 바꿔준다
        BufferedWriter bw = Files.newBufferedWriter(Paths.get(relativePath, fileName));
        bw.write(new String(multipartFile.getBytes()));

        commonCodeOurService.insertOne(params);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

    @RequestMapping(value = {"/insertMulti"}, method = RequestMethod.POST)
    public ModelAndView insertMulti(MultipartHttpServletRequest multipartHttpServletRequest, @RequestParam Map<String, Object> params, ModelAndView modelAndView) throws IOException {
        Iterator<String> fileNames =  multipartHttpServletRequest.getFileNames();

        String relativePath = "src/main/resources/static/files/";
        String absolutePath = commonUtils.getRelativeToAbsolutePath(relativePath);
        Map attachfile = null; 
        List attachfiles = new ArrayList();
        String physicalFileName = commonUtils.getUniqueSeqence();
        String storePath = absolutePath + physicalFileName + "\\";
        File newPath = new File(storePath);
        newPath.mkdir(); //폴더생성
        while(fileNames.hasNext()){
            String fileName = fileNames.next();
            MultipartFile multipartFile= multipartHttpServletRequest.getFile(fileName);
            String originalFileName = multipartFile.getOriginalFilename();

            if(originalFileName != null && multipartFile.getSize()>0){
            String storePathFileName = storePath + originalFileName;
            multipartFile.transferTo(new File(storePathFileName));
            attachfile = new HashMap<>();
            attachfile.put("ATTACHFILE_SEQ", commonUtils.getUniqueSeqence());
            attachfile.put("SOURCE_UNIQUE_SEQ", params.get("COMMON_CODE_ID"));
            attachfile.put("ORGINALFILE_NAME", originalFileName);
            attachfile.put("PHYSICALFILE_NAME", physicalFileName);
            attachfile.put("REGISTER_SEQ", params.get("REGISTER_SEQ"));
            attachfile.put("MODIFIER_SEQ", params.get("MODIFIER_SEQ"));

            attachfiles.add(attachfile);
            }
        }
        params.put("attachfiles",attachfiles);
        Object resultMap = commonCodeOurService.insertWithFilesAndGetList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }
        
    @RequestMapping(value = {"/formMulti"}, method = RequestMethod.GET)
    public ModelAndView formMulti(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        modelAndView.setViewName("commonCode_our/editMulti");
        return modelAndView;
    }

    //httpservletrequest는 spring에서 관리하지 않고 바로 사용가능하다
    // HttpServletRequest httpServletRequest: 서블렛에서 넘어온 request
    // @RequestParam Map<String, Object> params : 서블렛에서 넘어온 request를 spring 방식으로 조합해서 넘겨받는다.
    @RequestMapping(value = {"/deleteMulti"}, method = RequestMethod.POST)
    public ModelAndView deleteMulti(HttpServletRequest httpServletRequest, @RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        // modelAndView.addObject("resultMap", resultMap);
        String[] deleteMultis = httpServletRequest.getParameterMap().get("COMMON_CODE_ID");
        params.put("deleteMultis", deleteMultis);
        Object resultMap = commonCodeOurService.deleteMultiAndList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

}
