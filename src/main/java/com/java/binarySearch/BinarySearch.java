package com.java.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void run() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(5);
        array.add(7);
        array.add(1);
        array.add(10);
        array.add(9);
        array.add(8);
        array.add(7);
        Collections.sort(array);
        System.out.println(BinarySearch.binarySearch(array, 7));



    }

    public static int binarySearch(ArrayList<Integer> array, int item) {
        int low = 0;
        int high = array.size() - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            int guess = array.get(mid);
            if ( guess == item) {
                return mid;
            }
            if ( guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
