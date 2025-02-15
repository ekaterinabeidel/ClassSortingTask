package org.example;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numberArray = {8, 10, 49, 521, 938, 47, 87};
        quickSort(numberArray, 0, numberArray.length - 1);
        System.out.println(Arrays.toString(numberArray));
    }

    public static void quickSort(int[] numberArray, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) return;
        int pivot = numberArray[(leftIndex + rightIndex) / 2];
        int i = leftIndex;
        int j = rightIndex;
        while (i <= j) {
            while (numberArray[i] < pivot) i++;
            while (numberArray[j] > pivot) j--;
            if (i <= j) {
                int temp = numberArray[i];
                numberArray[i] = numberArray[j];
                numberArray[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(numberArray, leftIndex, j);
        quickSort(numberArray, i, rightIndex);
    }
}


