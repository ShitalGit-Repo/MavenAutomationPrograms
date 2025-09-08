package com.ex_02_RA_Concepts;

public class Lab04_API_Testing {

    public void Step1 (){
        System.out.println("Step 1");
    }
    public void Step2 (){
        System.out.println("Step 2");
    }
    public void Step3 (String param1){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        Lab04_API_Testing nbp = new Lab04_API_Testing();
        nbp.Step1();
        nbp.Step2();
        nbp.Step3("shital");
    }
}
