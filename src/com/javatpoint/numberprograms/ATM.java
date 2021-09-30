package com.javatpoint.numberprograms;

import java.util.Locale;

public class ATM {
    private static final int initialAmount=1000;
    private int balance;
    public int getBalance(){
        return balance;
    }

    public ATM(){
        balance=initialAmount;
    }
    public ATM(int balance){
        this.balance=balance;
    }

    public int withdraw(int amount){
        if (amount>balance) return 401;
        else {
            balance -= amount;
            return 201;
        }
    }

    public int deposit(long amount){
        balance+=amount;
        return 201;
    }

    public String message(String context, int code){
        switch (context.toLowerCase(Locale.ROOT)){
            case  "withdraw":
                switch (code){
                    case 201:
                        return "Withdraw has been made fromyour account";
                    case 401:
                        return "Withdraw was not possible because unsuficient amount in the account";
                    default:
                        return "Unknown code";
                }
            case "deposit":
                return "Deposit has been made to your account";
            case "balance":
                return "Your current balance is:"+ getBalance();
            default:
                return "Unknown code context";
        }
    }
}
