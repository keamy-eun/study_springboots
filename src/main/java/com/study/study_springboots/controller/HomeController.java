package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Data와 view의 파일이름(경로)만 담는다
@Controller
public class HomeController {
    @RequestMapping(value = {"", "/", "/main"}) //url이 value의 3가지에 포함되면 리턴이 같다
    public String main(){  
        int i = 0;
        System.out.println(i);
        return "main";
    }
    @RequestMapping(value = "/home")
    public void home(){  
        int i = 0;
        System.out.println(i);
    }
    @RequestMapping(value = "/homejsp")
    public String homejsp(){  //return에 String만 넣으면 경로로 인식한다
        int i = 0;
        System.out.println(i);
        return "home";
    }
    // HTML은 jasper가 인식하지 않는다.
    @RequestMapping(value = "/homehtml")
    public String homehtml(){  
        int i = 0;
        System.out.println(i);
        return "home.html";
    }
    
    @RequestMapping(value = "/jstlformats")
    public String jstlformats(){  
        int i = 0;
        System.out.println(i);
        return "jstl_formats";
    }
}
