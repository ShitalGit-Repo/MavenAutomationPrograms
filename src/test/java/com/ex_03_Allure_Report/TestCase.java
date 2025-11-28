package com.ex_03_Allure_Report;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestCase {

    String pincode ;

    @Test
    //Valid pincode
    public void test_tc_1_valid_pincode () {
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    //Special character
    public void test_tc_2_invalid_pincode () {
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    //blank ' '
    public void test_tc_3_invalid_pincode () {
        pincode = " ";
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
