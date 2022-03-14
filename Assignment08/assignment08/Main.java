package com.codewithmurali.assignment08;

public class Main {
    public static void main(String[] args) {
        UserAccount account = new UserAccount();
        account.setBal(5000);
        try {
            account.withdraw(5030);
            throw new NullPointerException("its a null pointer exception");
        } catch (AccountException  | NullPointerException e ) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }

        finally {
            System.out.println("thank you for choosing our bank services");
        }


    }
}
