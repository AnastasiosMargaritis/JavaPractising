package com.booking.cinemas.movies;

import com.sun.javafx.collections.ImmutableObservableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movies {

    public static final List<String> movies = new ArrayList<String>(){{
        add("Harry Potter");
        add("The Irishman");
        add("Parasites");
        add("Toy Story");
        add("The Hateful Eight");
        add("Inception");
        add("The Last Dance");
    }};


    public String getMovie(int index){
        return this.movies.get(index).toString();
    }
}
