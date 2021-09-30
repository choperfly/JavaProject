package com.javatpoint.numberprograms;

public class SunnyNumber {
    public static boolean isSunnyNumber(int number){
        double sunnyNum=Math.sqrt(number+1);
        if((sunnyNum-Math.floor(sunnyNum))==0) return true;
        else return false;
    }
}
