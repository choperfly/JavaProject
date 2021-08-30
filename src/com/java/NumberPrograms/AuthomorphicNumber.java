package com.java.NumberPrograms;

public class AuthomorphicNumber {
    public static boolean authomorphic(int number){
        int square =  number * number;
        while (number>0){
            if((number%10)!=(square%10)) return false;
            number=number/10;
            square=square/10;
        }
        return true;
    }
}
