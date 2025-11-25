package com.ex_06_Test_Assertion;

import org.testng.annotations.Test;
import org.testng.Assert ;
import org.testng.asserts.SoftAssert;

public class Lab25_TestNG_Assertion {

//    @Test
//    public void HardAssert (){
//        System.out.println("Strat the program");
//        Assert.assertEquals("promod", "Promod"); - if fails next code will not be executed.
//        System.out.println("End of the program");

        @Test
        public void SoftAssert (){
            SoftAssert softassert = new SoftAssert ();
            softassert.assertEquals("promod", "Promod"); //even it is failed, next code will be executed.
            System.out.println("End of the program");
            softassert.assertAll();
    }
}
