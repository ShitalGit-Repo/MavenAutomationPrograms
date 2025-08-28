package com.ex_01_RA_Basic;

import io.restassured.RestAssured;

public class Lab01_RestAssuredHelloWorld {
    public static void main(String[] args) {
        //https://restful-booker.herokuapp.com/ping -- we are checking if it is 200 status code.

        RestAssured.given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/ping")
                .when()
                    .log().all().get().
                then()
                    .log().all().statusCode(201);

    }

}
