package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 4, 8, 16, 31, 57, 99};
        int targetNumber = 1;

        System.out.println(binarySearch(numberArray, targetNumber));
    }
    public static int binarySearch(int[] numberArray, int targetNumber) {
        int leftIndex = 0;
        int rightIndex = numberArray.length - 1;
        int foundIndex = -1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (numberArray[middleIndex] == targetNumber) {
                foundIndex = middleIndex;
                break;
            } else if (numberArray[middleIndex] < targetNumber) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
        return foundIndex;
    }

}
