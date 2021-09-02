package com.java.NumberPrograms;

public class NeonNumber {

    public static String isNeonNumber(int number){
        //if(String.valueOf(number).length()<2) return "Number is less than 2 digits";
        int powNum = (int) Math.pow(number,2);
        int numberClone = number;
        int neonNum=0;
        while (powNum>0){
            neonNum+= powNum%10;
            powNum=powNum/10;
        }
        if(neonNum==number)
            return "Number:"+number+" is a neon number. Neon Validation:" +neonNum;
        else
            return "Number:"+number+" is not a neon number. Neon Validation:" +neonNum;
    }
}
