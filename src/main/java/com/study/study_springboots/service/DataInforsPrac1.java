package com.study.study_springboots.service;

import java.util.ArrayList;

import com.study.study_springboots.beans.BoardBean_prac1;

public class DataInforsPrac1 {
    public ArrayList<BoardBean_prac1> boardBeanList1(){
        ArrayList<BoardBean_prac1> boardBeanList = new ArrayList<BoardBean_prac1>();
        BoardBean_prac1 bbp1 = new BoardBean_prac1();
        bbp1.setTitle("A1_title");
        bbp1.setContent("A1_content");
        bbp1.setUserName("A1_userName");
        bbp1.setDate("A1_date");
        boardBeanList.add(bbp1);

        bbp1 = new BoardBean_prac1();
        bbp1.setTitle("B1_title");
        bbp1.setContent("B1_content");
        bbp1.setUserName("B1_userName");
        bbp1.setDate("B1_date");
        boardBeanList.add(bbp1);

        bbp1 = new BoardBean_prac1();
        bbp1.setTitle("C1_title");
        bbp1.setContent("C1_content");
        bbp1.setUserName("C1_userName");
        bbp1.setDate("C1_date");
        boardBeanList.add(bbp1);

        return boardBeanList;
    }
}
