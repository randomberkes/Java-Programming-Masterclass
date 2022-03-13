package com.randomberkes;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private double phone;

    public BankAccount() {
        System.out.println("empty constructor called");
    }

    public BankAccount(String customerName, String email, double phone){
        this(99999, 100.55, customerName, email, phone);
    }


    public BankAccount(int accountNumber, double balance, String customerName, String email, double phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void depositFunds(double fund) {
        this.balance += fund;
        System.out.println("Deposit of " + fund + " made. New balance is " + this.balance);
    }

    public void withdrawFunds(double fund) {

        if (this.balance >= fund) {
            this.balance -= fund;
            System.out.println("Withdrawal of " + fund + " processed. Remaining balance " + this.balance);
        } else {
            System.out.println("Only " + balance + "available. Withdrawal not processed");
        }
    }


}
