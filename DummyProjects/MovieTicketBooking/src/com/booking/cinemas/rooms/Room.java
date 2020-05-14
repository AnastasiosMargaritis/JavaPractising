package com.booking.cinemas.rooms;

import com.booking.cinemas.movies.Movies;
import com.booking.cinemas.rooms.seats.Seat;

import java.util.ArrayList;
import java.util.List;

public class Room extends RoomDetails{

    private String movie;
    private List<Seat> seats = new ArrayList<>();

    public Room(Integer id, Integer capacity, Size size) {
        super(id, capacity, size);
    }

    public void setMovieToRoom(String movie){
        this.movie = movie;
    }

    public String GetMovie(){
        return this.movie;
    }


}
