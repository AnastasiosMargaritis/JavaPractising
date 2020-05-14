package com.booking;

import com.booking.cinemas.MovieTheatre;
import com.booking.cinemas.OneSalonicaCinemas;
import com.booking.cinemas.SterCinemas;
import com.booking.cinemas.VillageCinemas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<MovieTheatre> movieTheatre = new ArrayList<>();

        movieTheatre.add(new VillageCinemas("Village", 7));
        movieTheatre.add(new SterCinemas("SterCinemas", 5));
        movieTheatre.add(new OneSalonicaCinemas("OneSalonica", 5));

        movieTheatre.get(0).printRooms();
        movieTheatre.get(1).printRooms();
        movieTheatre.get(2).printRooms();



    }
}
