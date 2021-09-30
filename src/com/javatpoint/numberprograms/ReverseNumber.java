package com.javatpoint.numberprograms;

public class ReverseNumber {

 /*   public static int reverseNumber(int number){
        int auxNumber,remainderNum,newNumber=0;
        boolean flag=false;
        while (flag==false){
            remainderNum=number%10;
            number=number/10;
            newNumber=( newNumber * 10 ) + remainderNum;
            if(number==0){
                flag=true;
            }
        }
        return newNumber;
    }*/
     public static int reverseNumberWhile(int number){
         int auxNumber,remainderNum,newNumber=0;
         while (number!=0){
             remainderNum=number%10;
             newNumber=( newNumber * 10 ) + remainderNum;
             number=number/10;
         }
         return newNumber;
     }

    public static int reverseNumberFor(int number){
        int auxNumber,remainderNum,newNumber=0;
         for(;number!=0;){
             remainderNum=number%10;
             newNumber=(newNumber*10) + remainderNum;
             number=number/10;
         }
         return newNumber;
    }


}
