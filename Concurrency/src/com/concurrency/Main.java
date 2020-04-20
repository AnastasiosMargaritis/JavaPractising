package com.concurrency;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello from the main thread");

        Thread anotherThread = new AnotherThread();

        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println("Hello from this fucking thread.");
            }
        }.start();


        Thread myRunnable = new Thread (new ThreadColor()){
            @Override
            public void run(){
                System.out.println("Hello Thread Color.");
            }
        };

        myRunnable.start();

        System.out.println("Manas to mni");
    }
}
