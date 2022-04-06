package com.java.basic;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String s = sc.next();
        int number1 = Integer.parseInt(s);
        System.out.println("Введите второе число: ");
        int number2 = sc.nextInt();
        System.out.println(Math.max(number1, number2));
        System.out.println((double) Math.min(number1, number2));
    }
}
