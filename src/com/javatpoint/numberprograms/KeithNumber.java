package com.javatpoint.numberprograms;

public class KeithNumber {

    public static boolean isKeithNumber(int number){
        int numberClone = number;
        int maxLength = String.valueOf(number).length();
        int[] seqNum = new int[maxLength];
        int seqNumIndex=0;
        int sumSeq=0;
        for (int i=maxLength-1;i>=0;i--){
            seqNum[i]= numberClone%10;
            numberClone=numberClone/10;
        }
        for (int i=0;i<number;){
            if (seqNumIndex==maxLength) seqNumIndex=0;
            sumSeq = sumArray(seqNum);
            if (sumSeq==number) return true;
            seqNum[seqNumIndex] = sumSeq;
            i=sumSeq;
            seqNumIndex++;
        }
        return false;
    }

    private static int sumArray(int[] arrayNum){
        int sum = 0;
        for (int i=0;i<arrayNum.length;i++){
            sum+=arrayNum[i];
        }
        return sum;
    }
}
