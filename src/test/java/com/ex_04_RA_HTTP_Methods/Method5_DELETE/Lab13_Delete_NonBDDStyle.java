package com.ex_04_RA_HTTP_Methods.Method5_DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab13_Delete_NonBDDStyle {
    RequestSpecification r;    //pre request
    Response response;         //making request
    ValidatableResponse vr;    //post request

    @Test
    public void Test_DELETE_NonBDD() {
        String bookingid = "749";
        String token = "c15727da12efa3b";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
//        r.header("cookie", "token" + token);
        r.cookie("token", token);

        response = r.when().log().all().delete();
        vr = response.then().log().all();
        vr.statusCode(201);
    }
}
