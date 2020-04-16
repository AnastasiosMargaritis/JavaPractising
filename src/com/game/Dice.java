package com.game;

import java.util.Random;

public abstract class Dice {

    protected Random random = new Random();
    protected int sides;

    public Dice(int sides){
        this.sides = sides;
    }

    public abstract void roll();
}
