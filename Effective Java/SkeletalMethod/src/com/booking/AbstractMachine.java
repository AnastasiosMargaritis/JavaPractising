package com.booking;

public abstract class AbstractMachine implements CoffeeMachine{

    @Override
    public void start() {
        System.out.println("Start coffee machine");
    }

    @Override
    public void stop() {
        System.out.println("Stop coffee machine");
    }

    @Override
    public void process() {
        start();
        chooseCoffee();
        stop();
    }


}
