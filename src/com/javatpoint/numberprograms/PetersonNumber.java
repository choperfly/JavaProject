package com.javatpoint.numberprograms;

public class PetersonNumber {

    private static long factorial(long number){
        long factorialNum=1;
        for(long i=number;i>0; i--){
            factorialNum*=i;
        }
        return factorialNum;
    }

    public static boolean isPeterson(long number){
        long auxNumber =number,sumFactorial=0;
        while (auxNumber>0){
            sumFactorial += factorial(auxNumber%10);
            auxNumber=auxNumber/10;
        }
        if (number==sumFactorial) return true;
        else return  false;
    }
}
