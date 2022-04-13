package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(myIntArray));

        reverse(myIntArray);
        System.out.println("Reversed array = " + Arrays.toString(myIntArray));

    }


    public static void reverse(int[] array) {

        // my crappy version of reversing an array
//        System.out.println(Arrays.toString(array));
//        int[] tempArray = new int[array.length];
//        tempArray[0] = array[4];
//        tempArray[1] = array[3];
//        tempArray[2] = array[2];
//        tempArray[3] = array[1];
//        tempArray[4] = array[0];
//        System.out.println(Arrays.toString(tempArray));

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
