package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListImp {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = linearSearch(arr, 5);
        System.out.println(index);

    }

    private static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }
}
