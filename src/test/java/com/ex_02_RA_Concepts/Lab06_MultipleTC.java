package com.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class Lab06_MultipleTC {
    public static void main(String[] args) {

//Direct BDD Style
        String pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
