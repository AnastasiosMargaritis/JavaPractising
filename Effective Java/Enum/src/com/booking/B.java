package com.booking;

public class B extends A {

    private String telephone;

    private B(String firstName, String lastName, String telephone){
        B.createA(firstName, lastName);
        this.telephone = telephone;
    }


    public static B createB(String firstName, String lastName, String telephone){
        return new B(firstName, lastName, telephone);
    }

    public String getTelephone() {
        return telephone;
    }
}
