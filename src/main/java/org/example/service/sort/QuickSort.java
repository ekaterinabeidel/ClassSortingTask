package org.example.service.sort;

import java.util.Comparator;

public class QuickSort {
    public static <T> void  quickSortWithComparator(T[] a, int leftIndex, int rightIndex, Comparator<T> comparator) {
        if (leftIndex > rightIndex) return;
        T pivot = a[(leftIndex + rightIndex) / 2];
        int i = leftIndex;
        int j = rightIndex;
        while (i <= j) {
            while (comparator.compare(a[i], pivot) < 0) i++;
            while (comparator.compare(a[j], pivot) > 0) j--;
            if (i <= j) {
                T temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        quickSortWithComparator(a, leftIndex, j, comparator);
        quickSortWithComparator(a, i, rightIndex, comparator);
    }
}


