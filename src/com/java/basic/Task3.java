package com.java.basic;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int last = array.length - 1;
        int x = array[0];
        array[0] = array[last];
        array[last] = x;
        System.out.println(array[0] + array[array.length/2]);
    }
}
