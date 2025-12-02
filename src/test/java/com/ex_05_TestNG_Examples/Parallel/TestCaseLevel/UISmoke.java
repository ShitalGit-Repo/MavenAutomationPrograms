package com.ex_05_TestNG_Examples.Parallel.TestCaseLevel;

import org.testng.annotations.Test;

public class UISmoke {

    @Test
    public void uismoke () {
        System.out.println(Thread.currentThread().getId());
    }
}
