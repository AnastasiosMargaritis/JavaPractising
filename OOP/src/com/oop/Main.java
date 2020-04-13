package com.oop;

public class Main {

    public static void main(String[] args) {

        Player me = new Player("Anastasios", 3, 10, true);

        me.moveUpDown();

        System.out.println(me.getMoves());
        }
    }

