package com.javatpoint.basicprograms;

public class PalindromeNumber {
    public static void palindromeNumber(int number){
        String numberText = String.valueOf(number);
        StringBuilder palindrome = new StringBuilder(numberText);
        String palindromeNumber = palindrome.reverse().toString();
        StringBuilder textResult = new StringBuilder(numberText);
        textResult.append(" the number is");
        if(numberText.equals(palindromeNumber)){
            textResult.append(" a palindrome ");
        } else {
            textResult.append(" not a palindrome ");
        }
        textResult.append(palindromeNumber);
        System.out.println(textResult);
        System.out.println(palindrome.reverse());
    }
}
