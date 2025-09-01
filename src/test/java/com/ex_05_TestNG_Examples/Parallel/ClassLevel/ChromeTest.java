package com.ex_05_TestNG_Examples.Parallel.ClassLevel;

import org.testng.annotations.Test;

public class ChromeTest {

    @Test
    public void test_chrome1 () {
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }
    @Test
    public void test_chrome2 () {
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }
}
