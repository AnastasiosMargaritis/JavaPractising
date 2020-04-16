package com.game;

import java.util.Random;

public class Cube extends Dice {

    private final int[] rolls = new int[] {1, 2, 3, 4, 5, 6};

    public Cube(int sides){
        super(sides);
    }


    @Override
    public void roll() {
        int value = random.nextInt(6);
        System.out.println(rolls[value]);
    }


}
