package com.codewithmurali.assignment08;

public class InsufficientFundsException extends Exception {
    InsufficientFundsException(){
        super("insufficient Funds to withdraw");
    }
    InsufficientFundsException(String message){
        super(message);
    }
}
