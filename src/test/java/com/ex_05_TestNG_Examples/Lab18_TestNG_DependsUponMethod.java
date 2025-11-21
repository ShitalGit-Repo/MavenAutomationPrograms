package com.ex_05_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab18_TestNG_DependsUponMethod {

    @Test
    public void ServerStartedOk () {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }
    @Test (dependsOnMethods = "ServerStartedOk")
    public void Test1 () {
        System.out.println("Method 1");
        Assert.assertTrue(true);
    }
    @Test (dependsOnMethods = "ServerStartedOk")
    public void Test2 () {
        System.out.println("Method 2");
        Assert.assertTrue(true);
    }
}
