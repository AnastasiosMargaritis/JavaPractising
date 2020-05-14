package com.booking.cinemas.movies;

import com.sun.javafx.collections.ImmutableObservableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movies {

    public static final List<String> movies = Collections.unmodifiableList(
            new ArrayList<String>(){{
                add("Harry Potter");
                add("The Irishman");
                add("Frozen");
                add("Parasites");
                add("The Hateful Eight");
                add("The Crown");
                add("Pablo Escobar");
            }}
    );

    public String getMovie(int index){
        return this.movies.get(index);
    }
}
