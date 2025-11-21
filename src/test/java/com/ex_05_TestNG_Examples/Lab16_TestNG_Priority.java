package com.ex_05_TestNG_Examples;

import org.testng.annotations.Test;

public class Lab16_TestNG_Priority {
//Here there are two BeforeTest so it will run with natural order.
//B comes first then T from so getBooking will execute first then GetToken
    @Test (priority = 1)
    public void test_t1 (){
        System.out.println("1");
    }
    @Test (priority = 3)
    public void test_t2 (){
        System.out.println("3");
    }
    @Test (priority = 2)
    public void test_t3 (){
        System.out.println("2");
    }
    @Test (priority = 4)
    public void test_t4 (){
        System.out.println("4");
    }
}
