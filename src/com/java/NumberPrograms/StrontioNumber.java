package com.java.NumberPrograms;

import java.util.ArrayList;

public class StrontioNumber {
    public static boolean isStrontioNumber(int number){
        if(String.valueOf(number).length()!=4) return false;
        int newNumber = number*2;
        char[] arrNumber = String.valueOf(newNumber).toCharArray();
        System.out.println(arrNumber[1]);
        System.out.println(arrNumber[2]);
        if(arrNumber[1] == arrNumber[2]) return true;
        return false;
    }
}
