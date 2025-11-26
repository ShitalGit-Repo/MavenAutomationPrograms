package com.ex_07_Payload_Management.String;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Lab27_RA_TestNG_AssertJ_Assertion {
    RequestSpecification requestSpecification;    //pre request
    Response response;         //making request
    ValidatableResponse vr;    //post request
    String token;
    Integer bookingID;

    @Test
    public void test_POT () {
    //Hashmap - key with value
    //Parent Hashmap - key, value and child Hashmap

        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>() ;
        jsonBodyUsingMap.put("firstname", "Promod") ;
        jsonBodyUsingMap.put("lastname", "Dutta");
        jsonBodyUsingMap.put("totalprice", 123);
        jsonBodyUsingMap.put("depositpaid", false);

        Map <String, String> bookingDatesMap = new LinkedHashMap<>() ;
        bookingDatesMap.put("checkin", "2025-12-01") ;
        bookingDatesMap.put("checkout", "2025-12-05");

        jsonBodyUsingMap.put("bookingdates", bookingDatesMap) ;
        jsonBodyUsingMap.put("additionalneeds", "breakfast") ;
        System.out.println(jsonBodyUsingMap);

    }

}
