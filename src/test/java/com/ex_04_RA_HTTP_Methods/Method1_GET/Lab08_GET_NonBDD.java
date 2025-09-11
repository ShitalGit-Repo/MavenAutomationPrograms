package com.ex_04_RA_HTTP_Methods.Method1_GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab08_GET_NonBDD {

    RequestSpecification r ;    //pre request
    Response response ;         //making request
    ValidatableResponse vr ;    //post request

    String pincode ;
    @Test
    public void Test_GET_nonBDD (){
        pincode = "560048";

        //PART-1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("in/" + pincode);

        //PART-2
        response = r.when().log().all().get();

        //PART-3
        vr = response.then().log().all();
        vr.statusCode(200);
    }
    @Test
    public void Test_GET_nonBDD_Negative (){  //non BDD style can use multiple times so useful for in case of multiple test cases
        pincode = "@";

        //PART-1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("in/" + pincode);

        //PART-2
        response = r.when().log().all().get();

        //PART-3
        vr = response.then().log().all();
        vr.statusCode(404);

    }
}
