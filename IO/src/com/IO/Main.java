package com.IO;

import javax.xml.stream.Location;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        List<People> people = new ArrayList<>();
        People Anastasis = new People("Anastasios", "Margaritis", 0);
        People Kostas = new People("Konstantinos", "Xatzistavros", 1);
        People Argy = new People("Argyris", "Ketsetsis", 2);

        people.add(Anastasis);
        people.add(Kostas);
        people.add(Argy);

        FileWriter locFile = null;
        Scanner s = new Scanner(System.in);

        try {
            locFile = new FileWriter("locations.txt");
            for(People p: people){
                locFile.write(p.getFirstName() + ", " + p.getLastName() + "\n");
            }
        }catch (IOException e) {
            System.out.println("In catch block.");
            e.printStackTrace();
        }finally {
            System.out.println("In finally block");
            try{
                if(locFile != null){
                    locFile.close();

                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        try{
            s = new Scanner(new BufferedReader(new FileReader("locations.txt")));
            s.useDelimiter(",");
            while(s.hasNextLine()){
                String firstName = s.next();
                s.skip(s.delimiter());
                String lastName = s.next();

                System.out.println(firstName + " " + lastName);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(s != null){s.close();}
        }

    }
}
