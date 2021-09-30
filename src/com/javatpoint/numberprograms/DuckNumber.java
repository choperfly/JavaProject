package com.javatpoint.numberprograms;

public class DuckNumber {
    public static boolean isDuckNumber(int number){
        for(int i=1;i>0;) {
            if (number % 10 == 0) return true;
            i=number=number/10;
        }
        return false;
    }
}
