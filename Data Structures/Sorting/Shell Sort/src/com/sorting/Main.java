package com.sorting;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {-14, 5, 55, 0, 300, 27, -1, 8, 49, 90};

        for(int gap = array.length / 2; gap > 0; gap--){

            for(int i = gap; i < array.length; i++){
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement){
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
