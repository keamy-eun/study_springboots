package com.study.study_springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping( value = "/notice")
public class NoticeController {
    @RequestMapping( value = {"/edit/{edit_uid}","/edit"}, method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable String edit_uid, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        HashMap<String,String> newHashMap = dataInfors.getDataByUid(edit_uid);

        modelAndView.addObject("newHashMap", newHashMap);
        modelAndView.setViewName("notice/edit");
        return modelAndView;
    }
    @RequestMapping( value = "/view", method = RequestMethod.POST)  // /board_our
    public ModelAndView view(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
        modelAndView.addObject("noticeParams", params);
        modelAndView.setViewName("notice/view");
        return modelAndView;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)    
    // public ModelAndView save(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
    public ModelAndView save(BoardBean boardBean, ModelAndView modelAndView) {
            // insert biz
        modelAndView.setViewName("notice/list");
        return modelAndView;
    }
}