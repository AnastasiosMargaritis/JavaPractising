package com.game;

import java.util.*;

public class Tetrahedron extends Dice {

    private final Map<Integer, Integer[]> rolls = new HashMap<>();



    public Tetrahedron(int sides){
        super(sides);
        rolls.put(1, new Integer[]{1, 2, 3});
        rolls.put(2, new Integer[]{1, 2, 4});
        rolls.put(3, new Integer[]{1, 3, 4});
        rolls.put(4, new Integer[] {2, 3, 4});
    }

    @Override
    public void roll() {
        int value = random.nextInt(3) + 1;
        System.out.println(Arrays.toString(rolls.get(value)));
        }
    }

