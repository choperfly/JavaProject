package com.javatpoint.numberprograms;

public class EmirpNumber {

    public static boolean isEmirpNumber(int number){
        boolean primeNumber,primeReverseNumber;
        int reverseNumber;
        // checking if the number is primer
        primeNumber=isPrimeNumber(number);
        if (primeNumber!=true) return false;
        //getting reverseNumber
        reverseNumber=reverseNumber(number);
        primeReverseNumber= isPrimeNumber(reverseNumber);
        //no reverse number, return false
        if (primeReverseNumber!=true) return false;
        //
        return true;
    }

    private static boolean isPrimeNumber (int numberToCheck){
        int divisionNumber=0,primeFlag=0;
        divisionNumber=numberToCheck/2;
        if(numberToCheck==0||numberToCheck==1){
            return false;
        }else{
            for(int i=2; i<=divisionNumber;i++) {
                if (numberToCheck % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int reverseNumber(int number){
        String numberText="";
        for (int i=1;i>0;){
            numberText= numberText + Integer.toString(number%10);
            number=number/10;
            i=number;
        }
        return Integer.parseInt(numberText);
    }
}
