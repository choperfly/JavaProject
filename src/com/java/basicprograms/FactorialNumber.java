package com.java.basicprograms;

public class FactorialNumber {
    public static void getFactorialNumber(int factorialNumber){
        int result=1;
        StringBuilder resultText = new StringBuilder("The factorial number for ");
        resultText.append(factorialNumber).append(" is ");
        for (int i=1;i<=factorialNumber;i++){
                result=result*i;
        }
        resultText.append(result);
        System.out.println(resultText);
    }
}
