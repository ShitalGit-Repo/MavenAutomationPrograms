package com.ex_05_TestNG_Examples.Parallel.TestCaseLevel;

import org.testng.annotations.Test;

public class DBSmoke {

    @Test
    public void dbsmoke () {
        System.out.println(Thread.currentThread().getId());
    }
}
