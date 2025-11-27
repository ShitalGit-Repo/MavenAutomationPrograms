package com.ex_05_TestNG_Examples;

import org.testng.annotations.Test;

public class Soft_vs_Hard_AlwaysRun {

    @Test
    public void login () {/* may be fail */}

    @Test (dependsOnMethods = "login")           //Hard Dependency
    public void PlaceOrder () {/*will run only if login pass */}

    @Test (dependsOnMethods = "login", alwaysRun = true)     //soft dependency
    public void CloseBrowser () {/* runs even if login failed */}
}
