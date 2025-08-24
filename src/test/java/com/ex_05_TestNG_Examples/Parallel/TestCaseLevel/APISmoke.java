package com.ex_05_TestNG_Examples.Parallel.TestCaseLevel;

import org.testng.annotations.Test;

public class APISmoke {

    @Test
    public void apismoke () {
        System.out.println(Thread.currentThread().getId());
    }
}
