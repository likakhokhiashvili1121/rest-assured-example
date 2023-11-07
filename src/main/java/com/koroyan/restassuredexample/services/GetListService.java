package com.koroyan.restassuredexample.services;

import com.koroyan.restassuredexample.pojos.request.GetListByNameRequest;
import com.koroyan.restassuredexample.pojos.response.GetListByNameResource;
import io.restassured.response.Response;

public class GetListService {
    public Response getListByName(String name) {
        GetListByNameRequest request = new GetListByNameRequest(name);
        return GetListByNameResource.getListByName(request);
    }
}