package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
public class BoardController {
    @RequestMapping( value = {"/board/list","", "/", "/board"}, method = RequestMethod.POST)
    public ModelAndView list(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardBean = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/list");
        return modelAndView;
    }
    @RequestMapping( value = "/board/view", method = RequestMethod.GET)
    public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView) {
        System.out.println("uid : " + uid);
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardBean = dataInfors.getDataListWithBoardBean();
        int cnt = 0;
        for(int i=0; i<boardBean.size(); i++){
            if(boardBean.get(i).getTitle().equals(uid)) cnt = i;
        }
        modelAndView.addObject("boardBean", boardBean.get(cnt));
        modelAndView.setViewName("board/view");
        return modelAndView;
    }
    @RequestMapping( value = "/board/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView) {
        modelAndView.setViewName("board/form");
        return modelAndView;
    }
    @RequestMapping( value = "/board/edit", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView) {
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }
}
