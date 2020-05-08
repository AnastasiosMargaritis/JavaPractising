package com.sorting;

public class Main {

    public static void main(String[] args) {
	    int[] array = {-15, 11, 7, 1 ,16, 4, 35, 666, 42, -97, -12, 9, 0, 31};


	    for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static void mergeSort(int[] input, int start, int end){


        if(end - start < 2){
            return;
        }

        int mid = (start + end) / 2;

        
    }
}
