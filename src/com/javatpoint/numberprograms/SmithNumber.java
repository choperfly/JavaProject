package com.javatpoint.numberprograms;

public class SmithNumber {
    public static boolean isSmitNumber(int $number){
        int $numberSum = sumDigits($number);
        //System.out.println($numberSum);
        int $factorialSum = sumPrimeFactors($number);
        //System.out.println($factorialSum);
        if($numberSum==$factorialSum) return true;
        else return false;
    }
   /* private static int sumPrimeFactors(int $number){
        int $factorialSum=0;
        List<Integer> primeFactor = new ArrayList<>();
        for(int $i=2; $i<=$number/2;$i++){
            if(($number%$i)==0) primeFactor.add($i);
        }
        for (Integer row:primeFactor){
            $factorialSum+=sumDigits(row);
        }
        return $factorialSum;
    }*/
   private static int sumPrimeFactors(int $number){
       int $factorialSum=0;
       for(int $i=2; $i<=$number/2;$i++){
           if(($number%$i)==0) $factorialSum+=sumDigits($i);
       }
       return $factorialSum;
   }
    private static int sumDigits(int $number){
        int $sumDigit=0;
        for(;$number>0;){
            $sumDigit+=$number%10;
            $number=$number/10;
        }
        return $sumDigit;
    }
}
