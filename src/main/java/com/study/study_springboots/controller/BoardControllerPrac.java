package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean_prac;
import com.study.study_springboots.service.DataInforsPrac;

@Controller
public class BoardControllerPrac {
    @RequestMapping(value = "/board_prac/list", method = RequestMethod.POST)
    public ModelAndView list(ModelAndView modelAndView){
        DataInforsPrac dip = new DataInforsPrac();
        ArrayList<BoardBean_prac> boardBeanList = dip.getBoardBeanList();
        modelAndView.addObject("boardBeanList", boardBeanList);
        modelAndView.setViewName("board_prac/list");
        return modelAndView;
    }
    
    @RequestMapping(value = "/board_prac/view", method = RequestMethod.GET)
    public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView){
        System.out.println("uid : "+uid);
        DataInforsPrac dip = new DataInforsPrac();
        ArrayList<BoardBean_prac> boardBeanList = dip.getBoardBeanList();
        int cnt = 0;
        for(int i=0; i<boardBeanList.size(); i++){
            if(boardBeanList.get(i).getTitle().equals(uid)) cnt = i;
        }
        modelAndView.addObject("boardBeanList", boardBeanList.get(cnt));
        modelAndView.setViewName("board_prac/view");
        return modelAndView;
    }
    
    @RequestMapping(value = "/board_prac/edit", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView){
        modelAndView.setViewName("board_prac/edit");
        return modelAndView;
    }
    
    @RequestMapping(value = "/board_prac/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView){
        modelAndView.setViewName("board_prac/form");
        return modelAndView;
    }
}
