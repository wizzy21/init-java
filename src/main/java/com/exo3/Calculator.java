package com.exo3;

public class Calculator {

    public static int add(int num1, int num2) Throws ArithmeticException{
        int sum = 0;
        try{
            sum = num1 +num2;
        } catch(ArithmeticException ae)
        {
            throw new ArithmeticException();
        }
        return sum;

    }

    public static int subtract(int num1, int num2) Throws ArithmeticException{
        int sumSubtract = 0;
        try{
        sumSubtract = num1 *num2;

    } catch(ArithmeticException ae){
        throw new ArithmeticException();
    }
        return sumSubtract ;

    }

    public static int multiplication(int num1, int num2) Throws ArithmeticException{
        int sumMultiply =0;
        try {
             sumMultiply = num1 * num2;

        } catch(ArithmeticException ae){
            throw new ArithmeticException();
            }
        return sumMultiply;

    }

    public static int division(int num1, int num2)Throws ArithmeticException{
int sumDivide =0;
        try {
        sumDivide = num1 / num2;
        } catch(ArithmeticException ae){
            throw new ArithmeticException();
        }
        return sumDivide;
    }


}
