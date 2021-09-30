package com.java.main;
import com.javatpoint.arrayprograms.*;
public class ArrayMain {

    public static void mainArray(){
        //Exercise 1
        copyArray();

        //Exercise 2
        getFrequencyNumber();

        //Exercise 3
        rotateArray();
        //Exercise 4
        getReverseElements();
    }

    private static void copyArray(){
        NumberProgramsMain.logMessage("Copy array");
        int[] arrNum = {1,2,3,4,5};
        ArraysExamples.getArrayToCopy(arrNum);
    }
    private static void getFrequencyNumber(){
        NumberProgramsMain.logMessage("Frequency Number");
       int number = 1134324359;
        ArraysExamples.getFrequencyNumber(number);
    }
    private static void rotateArray(){
        NumberProgramsMain.logMessage("Rotate Array");
        int[] arrNum = {1,2,3,4,5};
        ArraysExamples.getRotateArray(arrNum,2);
    }

    private static void getReverseElements(){
        NumberProgramsMain.logMessage("Rever elements in Array");
        int[] arrNum = {1,2,3,4,5};
        ArraysExamples.getInitRotateArr(arrNum);
    }

}
