package com.javatpoint.numberprograms;

public class AutobiographicalNumber {
    private static int  lenght;
    private static int[] arrayNum;
    public static String autobiographicalNumber(int number){
        lenght = String.valueOf(number).length();
        if (lenght>10) return "Invalid number";
        arrayNum = setArrayNum(number);
        if(isAutobigraphicalNum(arrayNum)){
            return "Number:"+number+" is an autobiographical Number";
        }else {
            return "Number:"+number+" is NOT an autobiographical Number";
        }
    }

    private static int[] setArrayNum(int number){
        int[] array = new int[lenght];
        int digit;
        for(int i= lenght-1; i>=0; i--){
            array[i] = number%10;
            number = number/10;
        }
        return array;
    }

    private static boolean isAutobigraphicalNum(int [] array){
        int count;
        boolean validation =true;
        for (int i=0; i<lenght;i++){
            count=0;
            for ( int j=0;j<lenght;j++){
                if(i== array[j]){
                    count++;
                }
            }
            if(count != arrayNum[i]) {
               validation =false;
                break;
            }
        }
        return validation;
    }
}
