package com.booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        //Creating object using Static Factory method.
        Child child = Child.birth("Anastasios", "Margaritis", new SimpleDateFormat("dd/MM/yyyy").parse("07/05/1993"));

        List<Child> children = new ArrayList<>();
        children.add(child);

        //Create two objects that extend a Java class.
        //Both objects use inherited builder.
        Citizen citizen = new Citizen.Builder("anastasismargaritis@gmail.com",
                                                "6982131395", children).firstName("Anastasios")
                                                    .lastName("Margaritis").addType(User.Type.CITIZEN).build();


        Doctor doctor = new Doctor.Builder(Doctor.Speciality.PSYCHO, "anastasismargaritis@gmail.com", "6982131395")
                        .firstName("Anastasios").lastName("Margaritis").addType(User.Type.DOCTOR).build();

        System.out.println(citizen.getEmail());
        System.out.println(doctor.getSpeciality().toString());
    }
}
