package com.java.NumberPrograms;

public class SpyNumber {

    public int number;
    public SpyNumber(int number){
        this.number=number;
    }
    public boolean isSpyNumber(){
        int cloneNumber=number;
        int sumNumber=0, multiNumber=1,digit;
        boolean isSpyNumber=false;
        while(cloneNumber>0){
            digit=cloneNumber%10;
            sumNumber+=digit;
            multiNumber*=digit;
            cloneNumber=cloneNumber/10;
        }
        if(sumNumber==multiNumber) isSpyNumber=true;
        return isSpyNumber;
    }

}
