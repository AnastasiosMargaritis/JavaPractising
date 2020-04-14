package com.keywords;

import java.util.Comparator;

public class Kerasia implements Area {

    private static String name;
    private final int population;

    public Kerasia(String name, int population){
        this.name = name;
        this.population = population;
    }



    public void setName(String name){
        this.name = name;
    }

    static void isVillage(String name){
        System.out.println(name + " is a Village.");
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean isCity() {
        return false;
    }

    @Override
    public boolean isCapital() {
        return false;
    }

    @Override
    public boolean hasAirport() {
        return false;
    }

    @Override
    public boolean IOTArea() {
        return false;
    }


}
