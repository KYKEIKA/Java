package com.java.basic;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Конвертер валют!!!");
        System.out.println("Введите курс доллара: ");
        double curseUSD = sc.nextDouble();
        System.out.println("Введите конвертируемую сумму в рублях: ");
        int rub = sc.nextInt();
        System.out.printf("Курс доллара: %.2f \nКоличество рублей: %d \nИтого: %.2f", curseUSD, rub, rub / curseUSD);
    }
}
