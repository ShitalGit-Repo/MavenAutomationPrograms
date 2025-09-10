package com.ex_04_RA_HTTP_Methods.Method1_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab07_GET_BDD_Style {

    @Test
    public void Test_GET_Request () {
        String pincode = "560048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("in/" + pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
