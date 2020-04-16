package com.collections;

import java.util.Scanner;

public class Menu {
    private final String[] options = new String[] {"Reserve", "Cancel", "Available Seats", "Exit"};
    private Theater theater;

    public void setTheater(Theater theater){
        this.theater = theater;
    }

    public void getMenu(){
        System.out.println("Options: ");
        System.out.println();
        System.out.println("1. " + options[0]);
        System.out.println("2. " + options[1]);
        System.out.println("3. " + options[2] );
        System.out.println("4. " + options[3] );
        System.out.println();

        System.out.println("Enter your option: ");
        System.out.println();
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();

        String seatNumber;

        while(option != 0){
            switch (option){
                case 1:
                    System.out.println("Reserve a new seat: ");
                    seatNumber = s.next();
                    theater.reserveSeat(seatNumber);
                    theater.getSeats();
                    break;

                case 2:
                    System.out.println("Enter your seat name: ");
                    seatNumber = s.next();
                    theater.cancelSeat(seatNumber);
                    break;
                case 3:
                    System.out.println("Available seats.");
                    theater.getSeats();
                    break;
                case 4:
                    System.out.println("GoodBye");
                    break;
            }
            System.out.println();
            System.out.println("Enter your option: ");
            option = s.nextInt();
        }

    }
}
