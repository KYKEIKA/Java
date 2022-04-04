package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        System.out.println("Заполните массив:");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        double m = 0;
        for (double v : array) {
            m += v / array.length;
        }
        System.out.println("Среднее арифметическое: " + m);
        for (int i = 0; i < array.length; i++) {
            array[i] *= m;
        }
        System.out.println(Arrays.toString(array));

    }
}
