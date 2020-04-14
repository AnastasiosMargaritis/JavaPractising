package com.keywords;

public class Main {

    public static void main(String[] args) {
        Kerasia kerasia = new Kerasia("Kerasia", 1000);

        kerasia.isVillage(kerasia.getName());

        Kerasia mihaniona = new Kerasia("Mihaniona", 12000);

        mihaniona.isVillage(mihaniona.getName());

        kerasia.setName("Aggelochori");

        Aggelochori aggelochori = new Aggelochori("Aggelochori", 1500);

        aggelochori.isVillage(aggelochori.getName());

    }
}
