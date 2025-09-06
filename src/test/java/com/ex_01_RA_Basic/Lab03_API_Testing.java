package com.ex_01_RA_Basic;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab03_API_Testing {
    public static void main(String[] args) {
        //Gherkin Syantax
        //Given ()-> Prerequisite -> URL, Headers, Auth, Body
        //When ()-> HTTP Method -> GET, POST, PUT, DELETE, PATCH
        //Then ()-> Validation -> 200 ok, firstname == "shital"

        //Full URL -> https://api.zippopotam.us/in/560016
        //Base URL -> https://api.zippopotam.us
        //Path URL -> /in/560016

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pincode");
        String pincode = sc.next();

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
