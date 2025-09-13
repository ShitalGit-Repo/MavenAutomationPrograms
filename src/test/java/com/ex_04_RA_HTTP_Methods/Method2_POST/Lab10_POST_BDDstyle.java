package com.ex_04_RA_HTTP_Methods.Method2_POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab10_POST_BDDstyle {

    @Test
    public void Test_Post_Auth() {
//we need URL, Payload, Header which we took from postman
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log()
                .all()
                .body(payload)
                .when()
                .log().all()
                .post()
                .then()
                .log().all()
                .statusCode(200);
    }
}
