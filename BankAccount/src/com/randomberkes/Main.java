package com.randomberkes;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount(12345, 0.00, "Bob Brown", "myemail@bob.com",
                871234567);
        account.withdrawFunds(100.0);

        account.depositFunds(50.0);
        account.withdrawFunds(100.0);

        account.depositFunds(51.0);
        account.withdrawFunds(100.0);


    }
}
