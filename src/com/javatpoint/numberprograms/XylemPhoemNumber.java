package com.javatpoint.numberprograms;

public class XylemPhoemNumber {
    public static String isXylenOrPhoenNumber(int number){
        String message="";
        int[] arrayNum = toArrayNum(number);
        if(isXylemNumber(arrayNum))
            message = "Number:"+number+" is a Xylen number";
        else
            message = "Number:"+number+" is Phloem number";
        return message;
    }

    private static boolean isXylemNumber(int[] number){
        int extremeNum = sumExtremeDigits(number);
        int meanNum = sumMeanDigits(number);
        return (extremeNum == meanNum)? true : false;
    }

    private static int sumExtremeDigits(int[] number){
        return number[0] + number[number.length-1];
    }

    private static int sumMeanDigits(int[] number){
        int sumNum=0;
        for ( int i=1; i<number.length-1; i++){
            sumNum += number[i];
        }
        return sumNum;
    }
    private static int[] toArrayNum(int number){
        int[] arrayNumb = Integer.toString(number).chars().map(c -> c - '0').toArray();
        return arrayNumb;
    }
}
