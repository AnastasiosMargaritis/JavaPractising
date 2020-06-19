package com.booking;

public class Main {

    public static void main(String[] args) {

        //Exercise 3, 7
        Default d = new Default();

        //Exercise 4
        Default d1 = new Default("Malaka");

        //Exercise 5
        Dog dog = new Dog();

        dog.barK(3);
        dog.bark();
        dog.bark(false);

        //Exercise 6
        dog.bark(true, 3);
        dog.bark(3, true);

        System.out.println(20 + 20 + "eBay");
        System.out.println("eBay" + 20 + 20 );
        
    }
}
