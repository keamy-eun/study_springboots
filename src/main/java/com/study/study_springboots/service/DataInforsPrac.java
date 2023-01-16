package com.study.study_springboots.service;

import java.util.ArrayList;

import com.study.study_springboots.beans.BoardBean_prac;

public class DataInforsPrac {

    public ArrayList<BoardBean_prac> getBoardBeanList(){
        ArrayList<BoardBean_prac> boardBeanList = new ArrayList<BoardBean_prac>();
        BoardBean_prac bbp = new BoardBean_prac();
        bbp.setTitle("A_title");
        bbp.setContent("A_content");
        bbp.setUserName("A_userName");
        bbp.setDate("A_date");
        boardBeanList.add(bbp);

        bbp = new BoardBean_prac();
        bbp.setTitle("B_title");
        bbp.setContent("B_content");
        bbp.setUserName("B_userName");
        bbp.setDate("B_date");
        boardBeanList.add(bbp);

        bbp = new BoardBean_prac();
        bbp.setTitle("C_title");
        bbp.setContent("C_content");
        bbp.setUserName("C_userName");
        bbp.setDate("C_date");
        boardBeanList.add(bbp);
        return boardBeanList;
    }

    public BoardBean_prac getBoardBeanA(){
        BoardBean_prac bbp = new BoardBean_prac();
        bbp.setTitle("A_title");
        bbp.setContent("A_content");
        bbp.setUserName("A_userName");
        bbp.setDate("A_date");
        return bbp;
    }
    
    public BoardBean_prac getBoardBeanB(){
        BoardBean_prac bbp = new BoardBean_prac();
        bbp.setTitle("B_title");
        bbp.setContent("B_content");
        bbp.setUserName("B_userName");
        bbp.setDate("B_date");
        return bbp;
    }
    
    public BoardBean_prac getBoardBeanC(){
        BoardBean_prac bbp = new BoardBean_prac();
        bbp.setTitle("C_title");
        bbp.setContent("C_content");
        bbp.setUserName("C_userName");
        bbp.setDate("C_date");
        return bbp;
    }
    
}
