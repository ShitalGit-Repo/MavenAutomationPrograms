package com.ex_06_Test_Assertion;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.RestAssured ;
import org.hamcrest.Matchers ;

public class Lab24_RA_Assertion {

    RequestSpecification requestSpecification ;    //pre request
    Response response ;         //making request
    ValidatableResponse vr ;    //post request
    String token;
    Integer bookingID;

    @Test
    public void create_booking_post () {
        //Payload --
        //Given   -- setting up body, URL, baseuri, basepath,
        //When    -- making the request
        //Then    -- extraction

        String request_payload = "{\n" +
                "        \"firstname\": \"Promod\",\n" +
                "        \"lastname\": \"Dutta\",\n" +
                "        \"totalprice\": 3000,\n" +
                "        \"depositpaid\": true,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2025-07-22\",\n" +
                "            \"checkout\": \"2025-07-27\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"Breakfast\"\n" +
                "    }";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/");
//header information
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(request_payload).log().all();

        response = requestSpecification.when().log().all().post();
//get validatable response to perform validation
        vr = response.then().log().all();
//rest assured assertion
        vr.statusCode(200);
//bookingid should not be null & firstname == promod
//extract the response body to do it
//        System.out.println(response.asString());

        vr.body("bookingid",Matchers.notNullValue());
        vr.body("booking.firstname", Matchers.equalTo("Promod"));




    }
}
