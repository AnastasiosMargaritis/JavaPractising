package com.booking.cinemas.rooms;

public class RoomDetails {

    private Integer id;
    private Integer capacity;
    private Size size;

    public RoomDetails(Integer id, Integer capacity, Size size) {
        this.id = id;
        this.capacity = capacity;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

}
