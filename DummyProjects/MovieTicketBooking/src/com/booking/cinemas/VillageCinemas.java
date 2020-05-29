package com.booking.cinemas;

import com.booking.cinemas.rooms.Room;
import com.booking.cinemas.rooms.Size;

import java.util.List;
import java.util.Random;

public class VillageCinemas extends Threatre implements MovieTheatre {


    public VillageCinemas(String name, Integer numberOfRooms) {
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
    public List<Room> getRooms() {
        return super.getRooms();
    }

    @Override
    public void printName() {
        System.out.println(super.getName());
    }
}
