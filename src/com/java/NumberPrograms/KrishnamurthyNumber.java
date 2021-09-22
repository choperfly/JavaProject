package com.java.NumberPrograms;

public class KrishnamurthyNumber {
    public static boolean isKrishnaNum(int number){
        int sum=0, numberAux=number;
        for(int i=1;i>0;){
            sum=sum + getFactorial(numberAux%10);
            i=numberAux=numberAux/10;
        }
        return (sum==number)? true:false;
    }

    public static int getFactorial(int number){
        int result=1;
        for(int i=2;i<=number;i++){
            result *= i;
        }
        return result;
    }
}
