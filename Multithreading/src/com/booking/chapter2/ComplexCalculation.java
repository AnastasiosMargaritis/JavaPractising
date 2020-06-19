package com.booking.chapter2;

import java.math.BigInteger;

public class ComplexCalculation extends Thread {

    private BigInteger base;
    private BigInteger power;
    private boolean isFinished = false;
    private BigInteger result = BigInteger.ONE;

    public ComplexCalculation(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        this.result = this.factorial(this.base, this.power);
        this.isFinished = true;
    }

    public BigInteger factorial(BigInteger base, BigInteger power){

        for(BigInteger i = BigInteger.ONE; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)){
            base = base.multiply(base);
        }

        return base;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public BigInteger getResult(){
        return result;
    }
}
