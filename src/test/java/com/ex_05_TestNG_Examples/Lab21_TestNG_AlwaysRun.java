package com.ex_05_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab21_TestNG_AlwaysRun {

    @Test
    public void Test01 (){
        Assert.assertTrue(true);
    }
    @Test (alwaysRun = true) //when you mention always run = true, it will always run
    public void Test02 (){
        Assert.assertTrue(true);
    }
    @Test
    public void Test03 (){
        Assert.assertTrue(true);
    }
}
