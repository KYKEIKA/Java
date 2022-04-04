package com.java.basic;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0 && n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println("Сумма нечетных чисел до числа " + n + " : " + sum);
        } else {
            System.out.println("Перезапустите программу и введите целое положительное число");
        }
    }
}
