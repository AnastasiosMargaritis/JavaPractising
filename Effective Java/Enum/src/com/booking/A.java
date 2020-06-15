package com.booking;

public class A{

    protected String firstName;
    protected String lastName;

    private A(String a, String b){
        this.firstName = a;
        this.lastName = b;
    }

    public A() {
    }

    public static A createA(String a, String b){
        return new A(a, b);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
