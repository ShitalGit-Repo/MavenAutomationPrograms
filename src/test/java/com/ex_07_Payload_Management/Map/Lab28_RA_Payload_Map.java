package com.ex_07_Payload_Management.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab28_RA_Payload_Map {
    RequestSpecification requestSpecification;    //pre request
    Response response;         //making request
    ValidatableResponse vr;    //post request
    String token;
    Integer bookingID;

    @Test
    public void test_post() {
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

//rest assured -- import org.hamcrest.Matchers; used 4-5%
        vr.body("bookingid", Matchers.notNullValue());
        vr.body("booking.firstname", Matchers.equalTo("Promod"));

//TestNG - extract the details in variables of the first name, booking id, lastname
        bookingID = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");

//Another mechanism to extract the details
        JsonPath jp = new JsonPath (response.asString()) ;
        String bookingID1 = jp.getString("bookingid");

        assertThat(jp.getInt("bookingid")).isEqualTo(5164);
        assertThat(jp.getInt("booking.firstname")).isEqualTo("Promod");
        assertThat(jp.getInt("booking.totalprice")).isEqualTo(3000);

        //TestNG Assertion -- used 75% of the time
        //Hard Assertion -- used 90% of the time
        Assert.assertEquals(firstname, "Promod");

        if (!firstname.contains("Promod")){
            Assert.fail("failed");
        }

        //Assertj -- 20% used. it id 3rd lib to assertion
        assertThat(bookingID).isNotZero().isNotNull().isPositive();
        //isNotZero().isNotNull().isPositive() - 3 test cases in one.
        assertThat(firstname).isNotBlank().isNotEmpty().isNotNull().isEqualTo("Promod");

    }
}
