package com.booking.cinemas;

import com.booking.cinemas.rooms.Room;

import java.util.List;

public interface MovieTheatre {


    public List<Room> getRooms();

    public void createRooms();

    public void printName();

}
