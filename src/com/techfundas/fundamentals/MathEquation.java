package com.techfundas.fundamentals;

/**
 * Created by Hp on 7/2/2018.
 */
public class MathEquation {
    public double lValue;
    public double rValue;
    public char opCode;
    public double result;

    public void execute(){
        switch (opCode) {
            case 'a':
                result = rValue + lValue;
                break;
            case 's':
                result = rValue - lValue;
                break;
            case 'm':
                result = rValue * lValue;
                break;
            case 'd':
                result = rValue != 0.0d ? rValue / lValue : 0.0d;
                break;
            default:
                System.out.println("Error - Enter valid character");
                result = 0.0d;
        }
    }
}
