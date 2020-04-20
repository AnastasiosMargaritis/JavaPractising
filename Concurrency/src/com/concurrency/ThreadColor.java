package com.concurrency;

public class ThreadColor  implements Runnable{

    @Override
    public void run(){
        System.out.println("Thread Color Running.");
    }
}
