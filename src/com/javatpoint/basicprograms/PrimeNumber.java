package com.javatpoint.basicprograms;
import static java.lang.System.*;
public class PrimeNumber {
    public static void primeNumber (int numberToCheck){
        int divisionNumber=0,primeFlag=0;
        divisionNumber=numberToCheck/2;
        StringBuilder result = new StringBuilder();
        result.append(numberToCheck);
        if(numberToCheck==0||numberToCheck==1){
            result.append(" is not prime number");
        }else{
            for(int i=2; i<=divisionNumber;i++) {
                if (numberToCheck % i == 0) {
                    result.append(" is not prime number");
                    primeFlag=1;
                    break;
                }
            }
            if(primeFlag==0){
                result.append(" is prime");
            }
        }
        out.println(result);
        }
}
