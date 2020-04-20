package com.IO;

public class People {

    private String firstName;
    private String lastName;
    private  long id;

    public People(String firstName, String lastName, long id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }


    public String getLastName(){
        return this.lastName;
    }
}
