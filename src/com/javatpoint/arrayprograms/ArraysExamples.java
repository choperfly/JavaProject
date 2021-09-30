package com.javatpoint.arrayprograms;

public class ArraysExamples {
    //copying a java array
    private static void printArray(int[] arrayNum){
        int [] newArray = copyArray(arrayNum);
        int i=0;
        for(int row: newArray){
            System.out.print("Position:"+i);
            System.out.println(" value:"+row);
            i++;
        }
    }
    public static void getArrayToCopy(int[] arrayNum){
        int [] newArray = copyArray(arrayNum);
        printArray(newArray);
    }
    private static int[] copyArray(int[] inArrayNum){
        int[] arrCopy = new int[inArrayNum.length];
        for(int i = 0; i <= inArrayNum.length-1;i++)
            arrCopy[i]=inArrayNum[i];
        return arrCopy;
    }

    //frequency of elements in an array
    public static void getFrequencyNumber(int number){
        int[] arrNumber = countFrequency(number);
        printArray(arrNumber);
    }

    private static int[] countFrequency(int number){
        int[] arrFreqNum = new  int[10];
        int digit;
        for (;number>0;){
            digit=number%10;
            arrFreqNum[digit]+=1;
            number=number/10;
        }
        return arrFreqNum;
    }

    public static void getRotateArray(int[] arrNum,int positions){
        int[] rotateArr = rotateArray(arrNum,positions);
        printArray(rotateArr);
    }

    private static int[] rotateArray(int[] arrNum, int positions){
        int [] arrRotate = new int[arrNum.length];
        int row=0;
        for(int i=0;i<arrNum.length;i++){
            if(i+positions <= arrNum.length-1) {
                arrRotate[i] = arrNum[i + positions];
            }
            else {
                arrRotate[i] = arrNum[row];
                row++;
            }
        }
        return arrRotate;
    }

    public static void getInitRotateArr(int[] arrNum){
        int[] arrRotate = rotateArray(arrNum);
        printArray(arrRotate);
    }

    private static int[] rotateArray(int[] arrNum){
        int[] arrRotate = new int[arrNum.length];
        for (int i=0;i<arrNum.length;i++){
            arrRotate[i] = arrNum[arrNum.length-1-i];
        }
        return arrRotate;
    }
}
