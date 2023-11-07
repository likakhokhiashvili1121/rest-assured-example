package com.koroyan.restassuredexample.pojos.request;

public class GetListByNameRequest {
    private String name;

    public GetListByNameRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
