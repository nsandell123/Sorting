package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] quickSortArray = new int[5];
        quickSortArray[0] = 5;
        quickSortArray[1] = 4;
        quickSortArray[2] = 3;
        quickSortArray[3] = 2;
        quickSortArray[4] = 1;
        quickSort(quickSortArray, 0, quickSortArray.length - 1);
        System.out.println(Arrays.toString(quickSortArray));
    }
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(array, start, end);
        quickSort(array, 0, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    public static int partition(int[] array, int start, int end) {
        int pIndex = start;
        int pivot = array[end];
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        swap(array, pIndex, end);
        return pIndex;
    }
    public static void swap(int[] array, int location1, int location2) {
        int temp = array[location1];
        array[location1] = array[location2];
        array[location2] = temp;
    }


}
