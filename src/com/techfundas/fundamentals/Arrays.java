package com.techfundas.fundamentals;

/**
 * Created by Hp on 6/30/2018.
 */
public class Arrays {

    public static void main(String[] args) {

        double[] rvalues = {50.0d, 100.0d, 17.0d, 45.0d};
        double[] lvalues = {10.0d, 20.0d, 30.0d, 56.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = rvalues[i] + lvalues[i];
                    break;
                case 's':
                    results[i] = rvalues[i] - lvalues[i];
                    break;
                case 'm':
                    results[i] = rvalues[i] * lvalues[i];
                    break;
                case 'd':
                    results[i] = rvalues[i] != 0.0d ? rvalues[i] / lvalues[i] : 0.0d;
                    break;
                default:
                    System.out.println("Error - Enter valid character");
                    results[i] = 0.0d;
            }
        }

            for (double inResult : results) {
                System.out.println("Result =" + inResult);
            }


    }
}