package com.booking;

import com.booking.cinemas.MovieTheatre;
import com.booking.cinemas.OneSalonicaCinemas;
import com.booking.cinemas.SterCinemas;
import com.booking.cinemas.VillageCinemas;
import com.booking.menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        List<MovieTheatre> movieTheatre = new ArrayList<>();


        movieTheatre.add(new VillageCinemas("Village", 7));
        movieTheatre.add(new SterCinemas("SterCinemas", 5));
        movieTheatre.add(new OneSalonicaCinemas("OneSalonica", 5));

        Menu.chooseRoom(Menu.chooseCinemas(movieTheatre));

    }
}
