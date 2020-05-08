package com.sorting;

public class Main {

    public static void main(String[] args) {
	    int[] array = {9, 5, 1, 10, 4, 6, 3, 2, 8, 7};

	    countingSort(array, 1, 10);

	    for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0;

        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
