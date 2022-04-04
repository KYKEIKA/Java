package com.java.basic;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int x = 1;
        final int y = 2;
        final int z = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        System.out.println("Заполните массив:");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : array) {
            if (i == x || i == y || i == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
