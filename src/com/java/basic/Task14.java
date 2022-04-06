package com.java.basic;

import java.util.Random;

public class Task14 {
    public static void main(final String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }
        int max = array[0];
        int min = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        int z = Math.abs(max) >= Math.abs(min) ? max : min;
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Наибольшее из min и max по модулю: " + z);
    }
}
