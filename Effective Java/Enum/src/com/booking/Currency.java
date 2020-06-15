package com.booking;

import java.util.Set;

public class Currency {

    public enum Coin {EUR, USD, YEN, FR, BIT, ETH}


    public void applyCoins(Set<Coin> coins){
        for(Coin c: coins){
            System.out.println(c);
        }
    }
}
