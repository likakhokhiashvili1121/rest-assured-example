package com.koroyan.restassuredexample.pojos.response;

import com.koroyan.restassuredexample.pojos.request.GetListByNameRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.io.File;

public class GetListByNameResource {
    public static Response getListByName(GetListByNameRequest request) {
        return RestAssured.given()
                .baseUri("")
                .body(new File("request.xml"))
                .param("name", request.getName())
                .get("");
    }
}
//////////////////// cxovrebam damgala