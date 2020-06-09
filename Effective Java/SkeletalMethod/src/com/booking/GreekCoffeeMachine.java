package com.booking;

public class GreekCoffeeMachine extends Maintance implements CoffeeMachine {

    private class AbstractMachineDelegator extends AbstractMachine{
        @Override
        public void chooseCoffee() {
            System.out.println("Produce different types of greek coffee");
            System.out.println("choose type of coffee");
            System.out.println("pay for coffee");
            System.out.println("collect coffee");
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
