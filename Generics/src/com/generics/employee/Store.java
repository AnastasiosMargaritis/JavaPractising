package com.generics.employee;

import com.generics.Team;

import java.util.ArrayList;

import java.util.ArrayList;
public class Store <T extends Employee> implements Comparable<Store<T>> {

        private String name;
        private int shirtSales;
        private ArrayList<T> employees = new ArrayList<>();

        public Store(String name){
            this.name = name;
            this.shirtSales = 0;
        }

        public String getName(){
            return this.name;
        }

        public int getShirtSales(){
            return this.shirtSales;
        }

        public boolean addEmployee(T employee){
            if(employees.contains(employee)){
                System.out.println(employee.getName() + " is already employed.");
                return false;
            }else{
                employees.add(employee);
                System.out.println(employee.getName() + " is employed.");
                return true;
            }
        }

        public int numberOfEmployees(){
            return this.employees.size();
        }

        public void shirtSales(int sales){
            this.shirtSales += sales;
        }

        @Override
        public int compareTo(Store<T> store){
            if(this.shirtSales > store.shirtSales){
                return -1;
            }else if(this.shirtSales < store.shirtSales){
                return 1;
            }else
            {
                return 0;
            }
    }

}
