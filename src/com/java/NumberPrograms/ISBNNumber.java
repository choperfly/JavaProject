package com.java.NumberPrograms;

public class ISBNNumber {
    public static boolean isISBNNumber(long number){
        if(Long.toString(number).length() != 10) return false;
        int sumNumber=0;
        for (int i=1;i<=10;i++){
            sumNumber= (int) (sumNumber + (i*(number%10)));
            number=number/10;
        }
        if(sumNumber%11==0) return true;
        else    return false;
    }

}
