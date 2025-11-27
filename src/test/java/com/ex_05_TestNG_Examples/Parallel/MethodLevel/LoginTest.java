package com.ex_05_TestNG_Examples.Parallel.MethodLevel;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void validlogin () {
        System.out.println("validlogin-Thread" + Thread.currentThread().getId());
    }
    @Test
    public void invalidlogin () {
        System.out.println("invalidlogin-Thread" + Thread.currentThread().getId());
    }
}
