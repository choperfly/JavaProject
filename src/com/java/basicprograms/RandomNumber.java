package com.java.basicprograms;
import java.util.Random;
//import java.math.*;
public class RandomNumber {

    //##method to display data
    public static void printRandomMath(){
        int minNumber = getRandomNumber(1,10);
        int maxNumber = getRandomNumber(100,1000);
        //System.out.println("Print random number from Math class: " + getRandomNumber(1,10));
        System.out.println("Print random number from Random class in: " + getRandomNumber());
        System.out.println("Print random number from Random class with max: " + getRandomNumber(maxNumber));
        System.out.println("Print random number from Random class by boolean: " + getRandomBoolean());
    }

    //##Random number generated by math.random()
    //The class returns double value only.
    //located in java.math;
    private static int getRandomNumber(int minNumber, int maxNumber){
        int randomNum = (int) (Math.random() * (maxNumber-minNumber+1)+minNumber);
        return randomNum;
    }

    //##Random number generated by Java random class
    //The class returns integer,float,double, boolean, long.
    // import java.lang.Random;
    private static int getRandomNumber(){
        Random randomObj = new Random();
        int random = randomObj.nextInt();
        return random;
    }

    private static int getRandomNumber(int number){
        Random randomObj = new Random();
        int random = randomObj.nextInt(number);
        return random;
    }

    private static boolean getRandomBoolean(){
        Random randomObj = new Random();
        return randomObj.nextBoolean();
    }
}
