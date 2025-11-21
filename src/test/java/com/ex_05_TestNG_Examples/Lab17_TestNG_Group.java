package com.ex_05_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab17_TestNG_Group {

    @Test (groups = {"Reg", "Sanity"})
    public void Test_SanityRun (){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test (groups = {"Reg"})
    public void Test_RegRun (){
        System.out.println("Reg");
        Assert.assertTrue(false);
    }
    @Test (groups = {"Reg", "Smoke"})
    public void Test_SmokeRun (){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

}
