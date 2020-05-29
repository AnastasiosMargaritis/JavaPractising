package com.booking.menu;

import com.booking.cinemas.MovieTheatre;
import com.booking.cinemas.rooms.Room;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private static int option;



    public static MovieTheatre chooseCinemas(List<MovieTheatre> movieTheatres){

        Scanner scanner = new Scanner(System.in);

        do{

            for(int i = 1; i <= movieTheatres.size(); i++){

                System.out.print(i + ". ");
                movieTheatres.get(i - 1).printName();

            }

            System.out.println();
            System.out.print("Choose your preferred cinema: ");
            option = scanner.nextInt();

        }while(option < 1 || option > movieTheatres.size());

        System.out.println("\n \n \n");
        return movieTheatres.get(option - 1);
    }

    public static Room chooseRoom(MovieTheatre movieTheatre){
        Scanner scanner = new Scanner(System.in);

        movieTheatre.printName();
        System.out.println("---------------------------");

        do{
            for(int i = 0; i < movieTheatre.getRooms().size(); i++){
                System.out.println(i + 1 + ". " + "Room " + movieTheatre.getRooms().get(i).getId().toString() + " -> "
                                    + movieTheatre.getRooms().get(i).GetMovie());
            }

            System.out.println();
            System.out.print("Choose your preferred room: ");
            option = scanner.nextInt();
        }while(option < 1 || option > movieTheatre.getRooms().size() + 1);

        return movieTheatre.getRooms().get(option - 1);
    }


}
