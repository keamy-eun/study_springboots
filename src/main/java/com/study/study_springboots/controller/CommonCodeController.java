package com.study.study_springboots.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.service.CommonCodeService;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {
    @Autowired
    CommonCodeService commonCodeService;

    @RequestMapping(value = "/list")
    public ModelAndView list(@RequestParam Map<String, String> params, ModelAndView modelAndView) {
        Object resultMap = commonCodeService.getList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/commonCode/list");
        return modelAndView;
    }
    
    @RequestMapping(value = {"/edit/{uniqueId}"}, method = RequestMethod.GET)
    public ModelAndView edit( @RequestParam Map<String, Object> params, @PathVariable String uniqueId, ModelAndView modelAndView) {
        params.put("COMMON_CODE_ID", uniqueId);
        Object resultMap = commonCodeService.getOne(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/commonCode/edit");
        return modelAndView;
    }
    
}
