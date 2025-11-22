package com.ex_05_TestNG_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab19_TestNG_Parameter {

    @Parameters ("browser")
    @Test
    public void demo1 (String value){
        System.out.println("Hi I am demo");
        System.out.println("You are running tis param");

        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }
        if (value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome");
        }
    }
    
}
