package com.techfundas.fundamentals;

/**
 * Created by Hp on 6/30/2018.
 */
public  class OopsBasics {
    //executable code

    int passangers;
    int seats;

    OopsBasics(){
        seats = 10;
        passangers = 0;
    }
    void addPassangers(){
     if(passangers < seats)
         passangers +=1; // passangers = passangers + 1;
        System.out.println(" Passenger count "+ passangers);
    }

    int addition(String x, String y){
       /* int x = 5;
        int y = 10;
        int result = x+y;*/

       int result = Integer.parseInt(x)+Integer.parseInt(y);

        return result;
    }


    public static void main(String[] args){
        OopsBasics oBasic = new OopsBasics();
        oBasic.addPassangers();
        System.out.println("addition "+ oBasic.addition("4","5"));
    }

}
