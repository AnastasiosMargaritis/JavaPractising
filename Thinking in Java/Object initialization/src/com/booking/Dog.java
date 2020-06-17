package com.booking;

public class Dog {

    public void bark(){
        System.out.println("Calling bark");
    }

    public void barK(int time){
        for(int i = 0; i < time; i++){
            System.out.println("bark");
        }
    }

    public void bark(boolean isBarking){
        if(!isBarking){
            System.out.println("Not barking");
        }else{
            System.out.println("Bark");
        }
    }

    public void bark(boolean isBarking, int times){
        if(!isBarking){
            System.out.println("Not Barking");
        }else{
            for(int i = 0; i < times; i++){
                System.out.println("Bark bark");
            }
        }
    }

    public void bark(int times, boolean isBarking){
        if(!isBarking){
            System.out.println("Not Barking");
        }else{
            for(int i = 0; i < times; i++){
                System.out.println("Bark");
            }
        }
    }




}
