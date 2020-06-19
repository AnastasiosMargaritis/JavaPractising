package com.booking;

import com.booking.chapter2.ComplexCalculation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<BigInteger> bases = Arrays.asList(new BigInteger("2000000000"), new BigInteger("1000000"), new BigInteger("3"), new BigInteger("40"));
        List<BigInteger> powers = Arrays.asList(new BigInteger("2"), new BigInteger("200000"), new BigInteger("4"));

        List<ComplexCalculation> threads = new ArrayList<>();

        for(BigInteger base: bases){
            for(BigInteger power: powers){
                threads.add(new ComplexCalculation(base, power));
            }
        }

        for(Thread t: threads){
            t.setDaemon(true);
            t.start();
        }

        for(Thread t: threads){
            t.join(2000);
        }

        for(int i = 0; i < threads.size(); i++){
            ComplexCalculation c = threads.get(i);

            if(c.isFinished()){
                System.out.println("The power for calculation " + i + " is " + c.getResult());
            }else{
                System.out.println("Calculation " + i + " is still running.");
            }
        }

    }
}
