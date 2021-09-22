package com.java.NumberPrograms;

public class BuzzNumber {
    public static boolean isBuzzNumber(int number){
        if(number%10==7 || (number%7)==0) return true;
        return false;
    }
}
