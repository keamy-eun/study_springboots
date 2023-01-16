package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.study.study_springboots.beans.BoardBean;

public class DataInfors {

    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "요주의랩!");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors DataInfors = new DataInfors();
        HashMap<String, String> searchForm = DataInfors.getSearchFormData();
        ArrayList<String> tablesListWithString = DataInfors.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithMamberBean", DataInfors.getDataWithMamberBean());
        bundlesData.put("dataListWithBoardBean", DataInfors.getDataListWithBoardBean());

        return bundlesData;
    }

    public BoardBean getDataWithMamberBean(){
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }
    public static ArrayList<BoardBean> membersList;
    public ArrayList<BoardBean> getDataListWithBoardBean() {
        membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Hello");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        boardBean.setDate("2022.11.11");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Otto");
        boardBean.setContent("Thornton");
        boardBean.setUserName("@fat");
        boardBean.setDate("2022.12.12");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Jasco");
        boardBean.setContent("Bird");
        boardBean.setUserName("@twitter");
        boardBean.setDate("2022.12.31");
        membersList.add(boardBean);
        return membersList;
    }

    public HashMap<String,String> getDataByUid(String edit_uid){
        // edit_uid를 넘겨주고 매칭되는 값을 리턴
        int cnt = 0;
        for(int i=0; i<membersList.size(); i++){
            if(membersList.get(i).getTitle().equals(edit_uid)) cnt = i;
        }

        HashMap<String,String> hashmap = new HashMap<String,String>();
        hashmap.put("title", membersList.get(cnt).getTitle());
        hashmap.put("content", membersList.get(cnt).getContent());
        hashmap.put("userName", membersList.get(cnt).getUserName());
        hashmap.put("date", membersList.get(cnt).getDate());
        return hashmap;
    }
    
}