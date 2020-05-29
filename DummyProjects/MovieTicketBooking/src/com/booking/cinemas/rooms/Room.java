package com.booking.cinemas.rooms;

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

    public void setSeats(){

        char seatLetter = 'A';
        int seatNumber = 1;

        if(super.getSize() == Size.SMALL){

            while (seatNumber < super.getCapacity()){

                if(seatNumber % 5 == 0 && seatNumber > 0){
                    seatLetter += 1;
                    seatNumber = 1;
                }

                this.seats.add(new Seat(seatLetter, seatNumber));
                seatNumber += 1;
            }

        }
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
