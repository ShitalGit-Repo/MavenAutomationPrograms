package com.ex_04_RA_HTTP_Methods.Method2_POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab09_POST_NonBDD {

    RequestSpecification r ;    //pre request
    Response response ;         //making request
    ValidatableResponse vr ;    //post request

    @Test
    public void  POST_NonBDD_Create_Token (){
//we need URL, Payload, Header which we took from postman
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println("-----Part-1-----");
        //PART-1
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);  //you can add more headers
//        r.header("Content-length", "1000");
        r.body(payload).log().all();

        System.out.println("-----Part-2-----");
        response = r.when().log().all().post();

        System.out.println("-----Part-3-----");
        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
