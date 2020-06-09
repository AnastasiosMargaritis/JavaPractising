package com.booking;

public class EspressoCoffeeMachine implements CoffeeMachine {

    private class AbstractMachineDelegator extends AbstractMachine{
        @Override
        public void chooseCoffee() {
            System.out.println("Produce different types of espresso");
            System.out.println("Choose a type of espresso");
            System.out.println("Pay for espresso");
            System.out.println("Collect espresso");
        }
    }

    AbstractMachineDelegator delegator = new AbstractMachineDelegator();

    @Override
    public void start() {
        delegator.start();
    }

    @Override
    public void chooseCoffee() {
        delegator.chooseCoffee();
    }

    @Override
    public void process() {
        delegator.process();
    }

    @Override
    public void stop() {
        delegator.stop();
    }
}
