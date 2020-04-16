package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Theater {

   private final String name;
   public List<Seats> seats = new ArrayList<>();
   private final int numRows;
   private final int seatsPerRow;

    public Theater(String theatreName, int numRows, int seatsPerRow) {
        this.name = theatreName;
        this.numRows = numRows;
        this.seatsPerRow = seatsPerRow;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seats seat = new Seats(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public void getSeats() {
        int count = 0;
        for(Seats seat : seats) {
            System.out.print(seat.getSeatNumber() + " ");
            count++;
            if(count == this.seatsPerRow){
                System.out.println();
                count = 0;
            }
        }
    }

    public boolean reserveSeat(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seats midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                Seats reservedSeat = new Seats("R");
                seats.set(mid, reservedSeat);
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public boolean cancelSeat(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seats midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                Seats cancelledSeat = new Seats(seatNumber);
                seats.set(mid, cancelledSeat);
                return seats.get(mid).cancel(seatNumber);
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }


}
