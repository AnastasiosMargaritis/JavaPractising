package com.booking.cinemas;

import com.booking.cinemas.movies.Movies;
import com.booking.cinemas.rooms.Room;
import com.booking.cinemas.rooms.Size;
import com.booking.cinemas.rooms.seats.Seat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Threatre {

    private String name;
    private Integer numberOfRooms;
    private List<Room> rooms = new ArrayList<>();

    public Threatre(String name, Integer numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
    }

    protected void setRooms(Integer id, Integer capacity, Size size){
        this.rooms.add(new Room(id, capacity, size));

        Random random = new Random();
        this.rooms.get(id - 1).setMovieToRoom(Movies.movies.get(random.nextInt(7)));
    }

    public List<Room> getRooms(){
        return this.rooms;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public List<Seat> getRoomSeats(int index){
        return this.rooms.get(index).getSeats();
    }

}
