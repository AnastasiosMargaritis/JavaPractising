package com.booking;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {

//        Week week = Week.MONDAY;
//        for (Week w: Week.values()){
//            System.out.println(w);
//        }
//
//        Currency currency = new Currency();
//        currency.applyCoins(EnumSet.of(Currency.Coin.BIT, Currency.Coin.EUR));
//
//

        A a = A.createA("Anastasios", "Margaritis");

        System.out.println(a.getFirstName());

        B b = B.createB("Anthi", "Molozi", "6982131395");
        System.out.println(b.getFirstName());
        System.out.println(b.getLastName());
        System.out.println(b.getTelephone());

    }
}
