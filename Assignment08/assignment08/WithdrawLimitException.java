package com.codewithmurali.assignment08;

public class WithdrawLimitException extends Exception{
    WithdrawLimitException(){
        super("the amount you want to withdraw is greater than per day limit");
    }
    WithdrawLimitException(String message){
        super(message);
    }
}
