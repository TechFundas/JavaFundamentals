package com.techfundas.fundamentals;

/**
 * Created by Hp on 6/30/2018.
 * Demo with classes
 */
public class MathExample {

    public static void main(String[] args) {

        /*double[] rvalues = {50.0d, 100.0d, 17.0d, 45.0d};
        double[] lvalues = {10.0d, 20.0d, 30.0d, 56.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];*/


       /* MathEquation[] equations = new MathEquation[5];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d,92.0d,'a');
        equations[2] = create(225.0d,17.0d,'s');
        equations[3] = create(11.0d,3.0d,'m');
        equations[4] = create(20.0d,3.0d,'a');*/

        MathEquationAccessSpecifiers[] equations = new MathEquationAccessSpecifiers[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d,92.0d,'a');
        equations[2] = create(225.0d,17.0d,'s');
        equations[3] = create(11.0d,3.0d,'m');

        //  for (int i = 0; i < opCodes.length; i++) {
            /*switch (opCodes[i]) {
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
            }*/
       // }
          /*  for (double inResult : results) {
                System.out.println("Result =" + inResult);
            }
*/
         /* for(MathEquation equation : equations){
              equation.execute();
              System.out.println("Result = "+ equation.result);
          }*/

        for(MathEquationAccessSpecifiers equation : equations){
            equation.execute();
            System.out.println("Result = "+ equation.getResults());
        }
    }


   /* public static MathEquation create(double lValue, double rValue, char opcode){
        MathEquation equation = new MathEquation();
        equation.lValue = lValue;
        equation.rValue = rValue;
        equation.opCode = opcode;
        return equation;
    }*/

    public static MathEquationAccessSpecifiers create(double lValue, double rValue, char opcode){
        MathEquationAccessSpecifiers equation = new MathEquationAccessSpecifiers();
        equation.setlValue(lValue);
        equation.setrValue(rValue);
        equation.setOpCode(opcode);
        return equation;
    }
}