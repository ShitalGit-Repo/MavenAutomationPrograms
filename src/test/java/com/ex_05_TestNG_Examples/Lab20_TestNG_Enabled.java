package com.ex_05_TestNG_Examples;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Lab20_TestNG_Enabled {

    @Test
    public void Test01 (){
        Assert.assertTrue(true);
    }
    @Test (enabled = false) //when you mention enabled = false, it will not run
    public void Test02 (){
        Assert.assertTrue(true);
    }
    @Test
    public void Test03 (){
        Assert.assertTrue(true);
    }
}
