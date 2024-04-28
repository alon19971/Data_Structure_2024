package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_theory {

    public static void main(String[] args) {

        // Definition - a linear data structure (an object), which contains elements of a similar data type.
        //              it is a data structure where we store similar elements.


    }

    // Various of functions that implements - Array

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static int evenNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void sortingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static int getSmallest(int[] arr, int k, int h) {
        int p = k;
        for (int i = k + 1; i <= h; i++) {
            if (arr[i] < arr[p])
                p = i;
        }
        return p;
    }


}
