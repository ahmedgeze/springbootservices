package com.ahmedgeze.webservice.response;

import java.util.List;

public class UniqueKurResponse extends BaseResponse {
    List<String> kurList;

    public List<String> getKurList() {
        return kurList;
    }

    public void setKurList(List<String> kurList) {
        this.kurList = kurList;
    }
}
