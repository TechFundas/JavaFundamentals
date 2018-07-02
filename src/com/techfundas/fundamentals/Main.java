package com.techfundas.fundamentals;

public class Main {

    public static void main(String[] args) {

     // Logical Operators
      /*  & ,| , ^, !

                & if(a ^ b > 0) false| true, true | false, true|true*/
//Assignment 1 - 06/29
        int v1= 1;
        int v2= 1;
        int result = v1>=v2?v1:v2;
       // System.out.println("result"+ result);
        if((v1 ^ v2)>0){
            System.out.println("Success");

        }else
        System.out.println("No Result");
    }

}
