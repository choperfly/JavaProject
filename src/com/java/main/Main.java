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
        //##AuthomorphicNumber
        /*for (int i=1;i<=100;i++) {
            //int randomNum=RandomNumber.getRandomNumber(1,1000);
            System.out.print("Number: "+i+" is ");
            System.out.print(AuthomorphicNumber.authomorphic(i)?"Authomorphic":"Not automorphic");
            System.out.println();
        }*/
        //##PetersonNumber
        //System.out.print("Number: 145 is ");
        //System.out.print(PetersonNumber.isPeterson(145) ?"Peterson Number":" not Peterson Number");
        //System.out.println();
        //System.out.print("Number: 130 is ");
        //System.out.print(PetersonNumber.isPeterson(130) ?"Peterson Number":" not Peterson Number");

        //## Sunny Number
        //int sunnyNumber=25;
        //System.out.print("Number:"+sunnyNumber+" is");
        //System.out.print(SunnyNumber.isSunnyNumber(sunnyNumber)?" sunny number":" not sunny number");

        //##Technumber
        /*int techNumber1=2025,techNumber2=1312;
        System.out.println(TechNumber.isTechNumber2(techNumber1));
        System.out.println(TechNumber.isTechNumber2(techNumber2));
        System.out.println(TechNumber.isTechNumber2(9));*/

        //##FascinatingNumber
        /*int techNumber1=192,techNumber2=328;
        System.out.println(FascinatingNumber.isFascinatingNumber(techNumber1));
        System.out.println(FascinatingNumber.isFascinatingNumber(techNumber2));*/

        //##Keith Number
        /*int number1=20,number2=742;
        System.out.println(KeithNumber.isKeithNumber(number1)?"Number:"+number1+" is keith number":"Number:"+number1+" is not keith number");
        System.out.println(KeithNumber.isKeithNumber(number2)?"Number:"+number2+" is keith number":"Number:"+number2+" is not keith number");
*/
       /* //##Neon Number
        int neonNumber1=9,neonNumber2=45;
        System.out.println(NeonNumber.isNeonNumber(neonNumber1));
        System.out.println(NeonNumber.isNeonNumber(neonNumber2));*/

        //##Spy Number
        int spyNumber1=132,spyNumber2=217;
        SpyNumber spyNum1 = new SpyNumber(spyNumber1);
        SpyNumber spyNum2= new SpyNumber(spyNumber2);
        System.out.println(spyNum1.isSpyNumber()?"Number:"+spyNumber1+" is a spynumber":"Number:"+spyNumber1+" is not a spynumber");
        System.out.println(spyNum2.isSpyNumber()?"Number:"+spyNumber2+" is a spynumber":"Number:"+spyNumber2+" is not a spynumber");
    }
}
