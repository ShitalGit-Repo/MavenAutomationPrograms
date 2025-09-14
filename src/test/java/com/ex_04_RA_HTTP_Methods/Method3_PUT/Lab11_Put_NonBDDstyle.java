package com.ex_04_RA_HTTP_Methods.Method3_PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab11_Put_NonBDDstyle {

    RequestSpecification r ;    //pre request
    Response response ;         //making request
    ValidatableResponse vr ;    //post request

    @Test
    public void Test_PUT_NonBDD (){
        String bookingid = "2900";
        String token = "8cb507106557cb0";
        String payload = "{\n" +
                "    \"firstname\" : \"lipi\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
//        r.header("cookie", "token" + token);
        r.cookie("token", token);
        r.body(payload).log().all();

        response = r.when().log().all().put();
        vr = response.then().log().all();
        vr.statusCode(200);


    }
}
