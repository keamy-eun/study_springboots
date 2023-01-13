package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PracController {
    @RequestMapping(value = {"/getUserList","/getUserLIST"}, method = RequestMethod.POST)
    public String getUserList(){
        return "/WEB-INF/views/board/pracJSP.jsp";
    }
    @RequestMapping(value = {"/getUserInfo","/getUserINFO"}, method = RequestMethod.GET)
    public String getUserInfo(){
        return "/WEB-INF/views/board/pracJSP2.jsp";
    }
    
}
