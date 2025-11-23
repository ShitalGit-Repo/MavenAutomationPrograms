package com.ex_05_TestNG_Examples;

import org.testng.annotations.Test;

public class Lab22_TestNG_InvocationCount {

//Invocation means repetition
    @Test (invocationCount = 2)
    public void Test01 (){
        System.out.println("Hi");
    }
    @Test(invocationCount = 3)
    public void Test02 (){
        System.out.println("Bye");
    }
}
