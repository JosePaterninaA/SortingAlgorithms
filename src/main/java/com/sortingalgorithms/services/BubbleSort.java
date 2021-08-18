package com.sortingalgorithms.services;

public class BubbleSort implements SortingService{
    @Override
    public int[] Sort(int[] array) {
        //Loops through array and swaps consecutive numbers that are not in order
        //Does this until no swap is needed
        int arrayLength = array.length;
        if(arrayLength < 2) return array;
        boolean swapNeeded = true;
        while(swapNeeded){
            swapNeeded = false;
            for(int i = 0; i < arrayLength-1; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                    swapNeeded = true;
                }
            }
        }
        return array;
    }

    private void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

}
