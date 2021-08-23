package com.java.basicprograms;

public class Fibonacci {
    public static void FibonacciExample(){
        short num1=0,num2=1,num3=0,count=10;
        System.out.println(num1+" "+num2);
        for(short i=2; i<count; ++i){
            num3= (short) (num1 + num2);
            System.out.println(" " + num3);
            num1=num2;
            num2=num3;
        }
    }

}
