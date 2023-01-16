package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean_prac1;
import com.study.study_springboots.service.DataInforsPrac1;

@Controller
public class BoardControllerPrac1 {
    @RequestMapping(value = "/board_prac1/list", method = RequestMethod.POST)
    public ModelAndView list(ModelAndView modelAndView){
        DataInforsPrac1 ddp1 = new DataInforsPrac1();
        ArrayList<BoardBean_prac1> boardBeanList = ddp1.boardBeanList1();
        modelAndView.addObject("boardBeanList", boardBeanList);
        modelAndView.setViewName("board_prac1/list");
        return modelAndView;
    }
    
    @RequestMapping(value = "/board_prac1/view", method = RequestMethod.GET)
    public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView){
        DataInforsPrac1 ddp1 = new DataInforsPrac1();
        ArrayList<BoardBean_prac1> boardBeanList = ddp1.boardBeanList1();
        int cnt = 0;
        for(int i=0; i<boardBeanList.size(); i++){
            if(boardBeanList.get(i).getTitle().equals(uid)) cnt = i;
        }
        modelAndView.addObject("boardBeanList", boardBeanList.get(cnt));
        modelAndView.setViewName("board_prac1/view");
        return modelAndView;
    }
    
    @RequestMapping(value = "/board_prac1/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView){
        modelAndView.setViewName("board_prac1/form");
        return modelAndView;
    }
    
    @RequestMapping(value = "/board_prac1/edit", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView){
        modelAndView.setViewName("board_prac1/edit");
        return modelAndView;
    }
}
