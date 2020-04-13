package com.oop;

public class Player extends Players implements Moves {

    boolean defend = false;
    public Player(String name, int lives, int moves, boolean defend) {
        super(name, lives, moves);
        this.defend = defend;
    }


    @Override
    public int moveUpDown() {
        return getMoves()-1 > 0 ? setMoves(getMoves()-1) : -1;
    }

    @Override
    public int moveLeftRight() {
        return getMoves()-1 > 0 ? setMoves(getMoves() - 1) : -1;
    }

    @Override
    public boolean shoot() {
        return false;
    }

    @Override
    public boolean defend() {
        return false;
    }
}
