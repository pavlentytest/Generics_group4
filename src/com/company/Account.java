package com.company;

public class Account<T, X, W> {
    private T id;
    private X balance;
    Account(T i, X b) {
        this.id = i;
        this.balance = b;
    }
    public W bbb() {
        return (W) new Object();
    }

    public T getId() {
        return id;
    }

    public X getBalance() {
        return balance;
    }
}
