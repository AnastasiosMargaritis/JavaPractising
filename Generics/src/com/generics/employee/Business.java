package com.generics.employee;

import java.util.ArrayList;
import java.util.Collections;

public class Business <T extends Store> {

    private  String name;
    private ArrayList<T> business = new ArrayList<T>();

    public Business(String name){
        this.name = name;
    }

    public boolean addStore(T store){
        if(business.contains(store)){
            return false;
        }else{
            business.add(store);
            return true;
        }
    }

    public void showBestBusiness(){

        Collections.sort(business);

        for(T t: business){
            System.out.println(t.getName() + " : " + t.getShirtSales());
        }
    }
}
