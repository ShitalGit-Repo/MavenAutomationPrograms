package com.ex_05_TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab15_Before_Test {

    @BeforeTest
    public void getToken (){
        System.out.println("Before Get Token");
    }
    @BeforeTest
    public void getBookingID (){
        System.out.println("Before Get Booking");
    }
    @Test
    public void test_PUT (){
        //Token and booking ID
        System.out.println("Put Request");
    }
    @AfterTest
    public void CloseAllThing (){
        System.out.println("Close");
    }

}
