package com.javatpoint.numberprograms;

public class TechNumber {
    private static boolean logEnable=true;
    public static String isTechNumber(int number){
        if(isOddNumber(number)==false) return "Number:"+number+" is not an odd number";
        int lenghtNum= String.valueOf(number).length()/2;
        log(Integer.toString(lenghtNum));
        int splitNum1=0,splitNum2=0,auxNumber=number;
        while (auxNumber>0) {
            if(lenghtNum>0){
                log("Log: "+lenghtNum);
                splitNum1+=auxNumber%10;
                log("Log splitNum1: "+splitNum1);;
                lenghtNum--;
            }else {
                splitNum2+=auxNumber%10;
                log("Log: splitNum2 "+splitNum2);
            }
            auxNumber=auxNumber/10;
            log("Log: auxnumber "+auxNumber);
        }
        int techNumber= (int) Math.pow(splitNum1+splitNum2,2);
        log("" + techNumber);
        return (techNumber==number)?"Number:"+number+" is a technumber":"Number:"+number+" is not a technumber";

    }

    private static boolean isOddNumber(int number){
        return ((String.valueOf(number).length()%2)==0)? true:false;
    }

    private static void log(String log){
        if(logEnable) System.out.println(log);
    }

    public static String isTechNumber2(int number){
        if(isOddNumber(number)==false) return "Number:"+number+" is not an odd number";
        int lenghtNum= String.valueOf(number).length();
        int lenghtNum2= String.valueOf(number).length()/2;
        String auxNumber=Integer.toString(number);
        int splitNum1= Integer.valueOf( auxNumber.substring(0,lenghtNum2));
        int splitNum2= Integer.valueOf( auxNumber.substring(lenghtNum2,lenghtNum));
        int techNumber= (int) Math.pow(splitNum1+splitNum2,2);
        log("" + techNumber);
        return (techNumber==number)?"Number:"+number+" is a technumber":"Number:"+number+" is not a technumber";

    }
}
