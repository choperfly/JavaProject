package com.java.main;

import com.java.NumberPrograms.*;
import com.java.basicprograms.*;

public class Main {
    public static void main(String[] args) {
       //basicPrograms();
        numberPrograms();
    }

    private static void basicPrograms(){
        //***Exercise#1 - Fibonacci example
        //Fibonacci.FibonacciExample();

        ////***Exercise#2 - Prime number
        /*for (int i = 0; i<11;i++ ) {
            PrimeNumber.primeNumber(i);
        }*/

        //***Exercise#3 - Palindrome
        //PalindromeNumber.palindromeNumber(1012);
        //PalindromeNumber.palindromeNumber(121);

        //***Exercise#4 - Factorial Number
        //FactorialNumber.getFactorialNumber(5);

        //***Exercise#5 - Factorial Number
        //ArmstrongNumber.isAmrstrongNumber(2000);

        //***Exercise #6 Random number
        RandomNumber.printRandomMath();

        //**Exercise #7 Patterns
        //Patterns.printTrianglePattern();

    }

    private static void numberPrograms(){
        //##Exercise 1.1 - Reverse number using while
        /*int randomNum=RandomNumber.getRandomNumber(1000,10000);
        System.out.println("Reverse Number for (while) " + randomNum);
        System.out.println(ReverseNumber.reverseNumberWhile(randomNum));
        //##Exercise 1.2 - Reverse number using for
        System.out.println("Reverse Number for (for) " + randomNum);
        System.out.println(ReverseNumber.reverseNumberFor(randomNum));*/
        //##Exercise 2.1 - Number to word
        /*for (int i=0;i<=10;i++) {
            int randomNum=RandomNumber.getRandomNumber(1,9999);
            System.out.println(NumberToWord.numberToWord(String.valueOf(randomNum).toCharArray()));
        }*/
        //##Exercise 3.1 - AuthomorphicNumber
        /*for (int i=1;i<=100;i++) {
            //int randomNum=RandomNumber.getRandomNumber(1,1000);
            System.out.print("Number: "+i+" is ");
            System.out.print(AuthomorphicNumber.authomorphic(i)?"Authomorphic":"Not automorphic");
            System.out.println();
        }*/
        //##PetersonNumber 3.2 - PetersonNumber
        //System.out.print("Number: 145 is ");
        //System.out.print(PetersonNumber.isPeterson(145) ?"Peterson Number":" not Peterson Number");
        //System.out.println();
        //System.out.print("Number: 130 is ");
        //System.out.print(PetersonNumber.isPeterson(130) ?"Peterson Number":" not Peterson Number");

        //## 3.2 - Sunny Number
        //int sunnyNumber=25;
        //System.out.print("Number:"+sunnyNumber+" is");
        //System.out.print(SunnyNumber.isSunnyNumber(sunnyNumber)?" sunny number":" not sunny number");

        //##3.3 Technumber
        int techNumber1=2025,techNumber2=1312;
        System.out.println(TechNumber.isTechNumber2(techNumber1));
        System.out.println(TechNumber.isTechNumber2(techNumber2));
        System.out.println(TechNumber.isTechNumber2(9));
    }
}
