package com.randomberkes;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "email@gmail.com");
    }


    public VipCustomer() {
        this("name", 333, "email@gmail.com");
    }


}
