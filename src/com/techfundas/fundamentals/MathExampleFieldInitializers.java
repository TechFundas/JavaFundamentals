package com.techfundas.fundamentals;

/**
 * Created by Hp on 6/30/2018.
 * Demo with classes
 */
public class MathExampleFieldInitializers {

    public static void main(String[] args) {
      /* MathEquationFieldInitializers initializers = new MathEquationFieldInitializers();
        initializers.execute();
        System.out.println("Results ");
        System.out.println(initializers.getResults());
*//*
        MathEquationFieldInitializers[] equations = new MathEquationFieldInitializers[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d,92.0d,'a');
        equations[2] = create(225.0d,17.0d,'s');
        equations[3] = create(11.0d,3.0d,'m');
*/

        MathEquationFieldInitializers[] equations = new MathEquationFieldInitializers[4];
        equations[0] = new MathEquationFieldInitializers('d', 100.0d, 50.0d);
        equations[1] = new MathEquationFieldInitializers('a',25.0d,92.0d);
        equations[2] = new MathEquationFieldInitializers('s',225.0d,17.0d);
        equations[3] = new MathEquationFieldInitializers('m',11.0d,3.0d);

        for(MathEquationFieldInitializers equation : equations){
            equation.execute();
            System.out.println("Result = "+ equation.getResults());
        }

    }


    public static MathEquationFieldInitializers create(double lValue, double rValue, char opcode){
        MathEquationFieldInitializers equation = new MathEquationFieldInitializers();
        equation.setlValue(lValue);
        equation.setrValue(rValue);
        equation.setOpCode(opcode);
        return equation;
    }
}