package com.ex_05_TestNG_Examples;

import org.testng.annotations.* ;

public class Lab23_TestNG_All_Annotations {

    @BeforeSuite
    void Demo1 (){
        System.out.println("Before Suite");
    }
    @BeforeTest
    void Demo2 (){
        System.out.println("Before Test");
    }
    @BeforeClass
    void Demo3 (){
        System.out.println("Before Class");
    }
    @BeforeMethod
    void Demo4 (){
        System.out.println("Before Method");
    }
    @Test
    void Demo5 (){
        System.out.println("Test");
    }
    @AfterTest
    void Demo6 () {
        System.out.println("After Test");
    }
    @AfterClass
    void Demo7 () {
        System.out.println("After Class");
    }
    @AfterMethod
    void Demo8 () {
        System.out.println("After Method");
    }
    @AfterSuite
    void Demo9 () {
        System.out.println("After Suite");
    }
}
