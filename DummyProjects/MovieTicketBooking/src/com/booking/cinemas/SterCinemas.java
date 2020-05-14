package com.booking.cinemas;

import com.booking.cinemas.MovieTheatre;
import com.booking.cinemas.rooms.Room;
import com.booking.cinemas.rooms.Size;

import java.util.List;
import java.util.Random;

public class SterCinemas extends Threatre implements MovieTheatre {

    public SterCinemas(String name, Integer numberOfRooms) {
        super(name, numberOfRooms);

        this.createRooms();
    }

    @Override
    public void createRooms() {
        Random random = new Random();

        for(int i = 0; i < super.getNumberOfRooms(); i++){
            int size = random.nextInt(3);

            if(size == 0){
                super.setRooms(i+1, 25, Size.SMALL);
            }else if(size == 1){
                super.setRooms(i+1, 50, Size.MEDIUM);
            }else{
                super.setRooms(i+1, 75, Size.BIG);
            }
        }
    }

    @Override
    public void printRooms() {
        System.out.println(super.getName());
        System.out.println("-----------------------");
        for(int i = 0; i < super.getRooms().size(); i++){
            System.out.println("Room " + super.getRooms().get(i).getId().toString());
        }

        System.out.println("=======================");
    }
}
