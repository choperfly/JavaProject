package com.javatpoint.basicprograms;
import java.lang.Math;

public class ArmstrongNumber {
    public static void isAmrstrongNumber(int numberToCheck){
        int armstrongNum = 0;
        StringBuilder text = new StringBuilder("Armstrong Number up to ");
        text.append(numberToCheck).append(" are");
        for(int i = 0; i <=numberToCheck;i++ ){
            armstrongNum=getArmstrongNumber(i);
            if (armstrongNum == i) {
              System.out.println(armstrongNum);
            }
        }
    }

    private static int getArmstrongNumber(int number){
        int tempVal=0,digits=0, totalSum = 0, digit=0;
        tempVal=number;
        while (tempVal>0){
            tempVal=tempVal/10;
            digits++;
        }
        tempVal=number;
        while (tempVal>0){
             digit = tempVal %10;
             totalSum += Math.pow(digit,digits);
             tempVal=tempVal/10;
        }
        return totalSum;
    }
}
