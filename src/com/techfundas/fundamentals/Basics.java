package com.techfundas.fundamentals;

/**
 * Created by Hp on 6/29/2018.
 */
public class Basics{

public static void main(String args[]){
   /* int fact= 3;
    int factorial= 1;

    *//*while(fact>1){
        factorial *= fact;
        fact -=1;
    }*//*

    while(fact>1){
        factorial *= fact--;
       // fact -=1;//
    }
   System.out.print("Factorial"+ factorial);

    */
    /*int value = 150;
    do{
        System.out.print( value);
        System.out.print(" * 2 =");
        value*=2;
        System.out.println(value);
    }while(value <50);*/

   /* float[] value = new float[4];
    value[0] = 1.0f;
    value[1] = 2.0f;
    value[2] = 3.0f;
    value[3] = 4.0f;
*/
    float[] value = { 1.0f,2.0f,3.0f,4.0f,5.0f};
    float sum = 0.0f;
    System.out.println("length of Array " +value.length );

    for (int i=0;i<value.length;i++){
        sum += value[i];

    }
    System.out.print("Summation " + sum);

}
    String passanger = "null";

    public String getPassanger1(){
        passanger = "Naveen";
        return passanger;
    }
    public String getPassanger2(){
        this.passanger = "Kumar";

        String Adults = this.passanger;
        return passanger;
    }




}

