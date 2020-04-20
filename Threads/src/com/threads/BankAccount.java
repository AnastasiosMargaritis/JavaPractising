package com.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;

    private Lock lock;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount){

        boolean status = false;
//        synchronized (this) {
//            balance += amount;
//            System.out.println("New account balance after deposit is: " + balance);
//        }


//        lock.lock();
//        try {
//            balance += amount;
//            System.out.println("New account balance after deposit is: " + balance);
//        }finally {
//            lock.unlock();
//        }

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    balance += amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println("Could not get the lock.");
            }
        }catch (InterruptedException e){

        }

        System.out.println("Transaction status equals: " + status);
    }

    public void withdraw(double amount){

        boolean status = false;

//        synchronized (this) {
//            balance -= amount;
//            System.out.println("New account balance after withdraw is: " + balance);
//        }


//        lock.lock();
//        try{
//            balance -= amount;
//            System.out.println("New account balance after withdraw is: " + balance);
//        }finally {
//            lock.unlock();
//        }


        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    balance -= amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println("Could not get the lock.");
            }
        }catch (InterruptedException e){

        }

        System.out.println("Transactions status is equal to: " + status);
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account Number equals: " + this.accountNumber);
    }
}
