package com.booking;

public class Main {

    public static void main(String[] args) {
	    CoffeeMachine espresso = new EspressoCoffeeMachine();
	    CoffeeMachine greek = new GreekCoffeeMachine();

	    espresso.process();
        System.out.println("*********************");
        greek.process();

        if(greek instanceof Maintance){
            Maintance m = (Maintance) greek;
            m.clean();
        }
    }
}
