package com.codewithmurali.assignment08;

public class UserAccount {
    private float bal;
    final float WITHDRAW_LIMIT = 50000.00f;
    public  void withdraw(float value) throws AccountException {
        if(value>WITHDRAW_LIMIT){
            WithdrawLimitException wle = new WithdrawLimitException();
            AccountException ae = new AccountException();
            ae.initCause(wle);
            throw ae;
        }
        if(bal<value){
            throw new AccountException(new InsufficientFundsException());
        }
    }

    public void setBal(float bal) {
        this.bal = bal;
    }
}
