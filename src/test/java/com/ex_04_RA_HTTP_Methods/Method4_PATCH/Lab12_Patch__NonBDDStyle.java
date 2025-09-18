package com.ex_04_RA_HTTP_Methods.Method4_PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab12_Patch__NonBDDStyle {

    RequestSpecification r ;    //pre request
    Response response ;         //making request
    ValidatableResponse vr ;    //post request

    @Test
    public void Test_PATCH_NonBDD (){
        String bookingid = "395";
        String token = "8e584baca504a0d";
        String payload = "{\n" +
                "    \"firstname\" : \"Promod\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
//        r.header("cookie", "token" + token);
        r.cookie("token", token);
        r.body(payload).log().all();

        response = r.when().log().all().patch();
        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
