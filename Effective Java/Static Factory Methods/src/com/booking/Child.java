package com.booking;

import java.util.Date;

public class Child {

    private String firstName;
    private String lastName;
    private Date birthDate;

    private Child(String firstName, String lastName, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public static Child birth(String firstName, String lastName, Date birthDate){
        return new Child(firstName, lastName, birthDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
