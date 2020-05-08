package com.sorting;

public class Main {

    public static void main(String[] args) {
	    int[] array = {-15, 4, 7, 99, 18, -30, -1, 0, 200, 6, -10, 6};

	    quickSort(array, 0, array.length);

	    for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end){


        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j){


            //NOTE: Empty Loop
            while(i < j && input[--j] >= pivot);

            if(i < j){
                input[i] = input[j];
            }

            while(i < j && input[++i] <= pivot);

            if(i < j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;

        return j;
    }
}
