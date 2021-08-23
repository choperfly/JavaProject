package com.java.NumberPrograms;

import sun.rmi.runtime.NewThreadAction;

public class NumberToWord {

    public static String numberToWord(char num[]){
        StringBuilder text = new StringBuilder();
        int len=num.length;
        if(len>4){
            text.append("number too long");
            return  text.toString();
        }
        //string type array for one digit
        text.append("Number ");
        String[] oneDigit = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven", "Eight","Nine"};
        String[] twoDigit = new String[]{"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] threeDigits = new String[]{"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] powDigits = new String[]{"Hundred","Thousand"};
        if(len==1){
            text.append(oneDigit[num[0]-'0']);
        }
        int x=0;
        while(x<num.length){
            if(len >=3){
                if (num[x] - '0' != 0){
                    text.append(oneDigit[num[x] - '0'] + " ");
                    text.append(powDigits[len-3]).append(" ");
                }
                --len;
            }else{
                if(num[x] - '0'==1){
                    int sum = num[x] - '0' + num[x+1] - '0';
                    text.append(twoDigit[sum]);
                    return text.toString();
                }else if (num[x] - '0' ==2 && num[x+1]-'0'==0){
                    text.append("Twenty");
                    return text.toString();
                }
                else{
                    int i = (num[x]-'0');
                    if(i>0){
                        text.append(threeDigits[i]).append("");
                    }else {
                        text.append("");
                        ++x;
                        if (num[x]-'0' !=0){
                            text.append(oneDigit[num[x] - '0']);
                        }
                    }
                    ++x;
                }
            }
        }
        return text.toString();
    }
}
