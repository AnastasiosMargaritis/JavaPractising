package com.concurrency;

public class AnotherThread extends Thread{

    @Override
    public void run(){
        System.out.println("Hello from another thread.");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("Another thread woke me up");
        }

        System.out.println("Drinking coffee after waking up.");
    }



}
