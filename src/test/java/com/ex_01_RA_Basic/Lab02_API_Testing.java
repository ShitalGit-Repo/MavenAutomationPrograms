package com.ex_01_RA_Basic;

import io.restassured.RestAssured;

public class Lab02_API_Testing {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().log().all().get()
                .then().log().all().statusCode(201);

    }
}
