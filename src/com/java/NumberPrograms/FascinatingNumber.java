package com.java.NumberPrograms;

public class FascinatingNumber {

    public static String isFascinatingNumber(int number){
        String[] locationNumber = new String[9];
        String numberX2=String.valueOf(number*2);
        String numberX3=String.valueOf(number*3);
        int sum= Integer.valueOf(String.valueOf(number) + numberX2 + numberX3);
        int auxNumber=sum;
        int index=0;
        while (auxNumber>0){
            index = auxNumber % 10;
            if(locationNumber[index-1]==null) locationNumber[index-1]=String.valueOf(index);
            else return "Number:"+number+" is not fascinating number";
            auxNumber=auxNumber/10;
        }
        return "Number:"+number+" is fascinating number";
    }
}
