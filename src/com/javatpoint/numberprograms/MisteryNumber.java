package com.javatpoint.numberprograms;

public class MisteryNumber {
    public static boolean isMisteryNumner(int number){
        System.out.println(number);
        int _reverseNumber;
        for(int i=1;i<number/2;i++){
            _reverseNumber=reverseDigit(i);
            if (_reverseNumber+i==number) return true;
        }
        return false;
    }
    private static int reverseDigit(int number){
        StringBuilder text = new StringBuilder(""+number);
        return Integer.parseInt(text.reverse().toString());
    }
}
