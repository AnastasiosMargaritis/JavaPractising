package com.oop;

public abstract class Players{

    private String name;
    private int lives = 3;
    private int moves = 10;


    public Players(String name, int lives, int moves) {
        this.name = name;
        this.lives = lives;
        this.moves = moves;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getMoves() {
        return moves;
    }

    public int setMoves(int moves) {
        this.moves = moves;
        return moves;
    }


}
