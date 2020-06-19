package com.booking;

public class Main1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());

        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }

    private  static class BlockingTask implements Runnable{

        @Override
        public void run() {
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println("Existing block thread");
            }
        }
    }
}
