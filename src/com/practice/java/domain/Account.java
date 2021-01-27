package com.practice.java.domain;

public class Account {

    private String username;
    private String password;
    private int balance;

    public Account(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositMoney(int amount) {
        balance += amount;
        System.out.println("New Balance : " + balance);
    }

    public void withdrawMoney(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance.\nYou can witdram max : " + balance);

        } else {
            balance -= amount;
            System.out.println("New Balance : " + balance);
        }

    }
}
