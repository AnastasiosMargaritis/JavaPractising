package com.game;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Cube cube = new Cube(6);
//        Tetrahedron tetrahedron = new Tetrahedron(4);
//        List<Integer> sorts = new Stack<>();
//
//        sorts.add(1);
//        sorts.add(10);
//        sorts.add(4);
//
//        System.out.println(sorts);

        Set<String> names = new HashSet<>();

        names.add("Anastasios");
        names.add("Panagiotis");
        names.add("Stefanos");

        System.out.println(names.hashCode());

        Set<String> surrNames = new HashSet<>();

        surrNames.add("Anastasios");
        surrNames.add("Panagiotis");
        surrNames.add("Fillipos");

        System.out.println(surrNames.hashCode());
;
    }
}
