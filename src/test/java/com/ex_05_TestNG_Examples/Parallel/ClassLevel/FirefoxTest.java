package com.ex_05_TestNG_Examples.Parallel.ClassLevel;

import org.testng.annotations.Test;

public class FirefoxTest {

    @Test
    public void test_firefox () {
        System.out.println("2");
        System.out.println(Thread.currentThread().getId());
    }
}
