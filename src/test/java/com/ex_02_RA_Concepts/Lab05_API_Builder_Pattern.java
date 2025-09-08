package com.ex_02_RA_Concepts;

public class Lab05_API_Builder_Pattern {

    public Lab05_API_Builder_Pattern Step1 (){
        System.out.println("Step 1");
        return this;
    }
    public Lab05_API_Builder_Pattern Step2 (){
        System.out.println("Step 2");
        return this;
    }
    public Lab05_API_Builder_Pattern Step3 (String param1){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        Lab05_API_Builder_Pattern bp = new Lab05_API_Builder_Pattern();
        bp.Step1().Step2().Step3("shital");

    }
}
