package com.collections;

public class Seats implements Comparable<Seats> {
    private final String seatNumber;
    private boolean reserved = false;

    public Seats(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public int compareTo(Seats seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }

    public boolean reserve() {
        if (!this.reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel(String seatNumber) {
        if (this.seatNumber == seatNumber) {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
            return true;
        } else {
            return false;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}