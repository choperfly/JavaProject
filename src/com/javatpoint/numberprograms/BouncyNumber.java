package com.javatpoint.numberprograms;

public class BouncyNumber {

    public static boolean isBouncyNumber(int number){
        if (number<=100) return false;
        String _number = Integer.toString(number);
        boolean _increase=true,_decrease =true;
        //incremental for
        for(int i=0; i<_number.length()-1;i++){
             if(_number.charAt(i) > _number.charAt(i+1) ){
                 _increase=false;
                 break;
             }
        }
        for(int i=0; i<_number.length()-1;i++){
            if(_number.charAt(i) < _number.charAt(i+1) ){
                _decrease=false;
                break;
            }
        }
        return (_increase || _decrease)? false:true;
    }
}
