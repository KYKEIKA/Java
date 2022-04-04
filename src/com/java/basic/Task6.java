package com.java.basic;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("конвертер физических величин!");
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println("Выберите единицу измерения: 1 - кг, 2 - грамм");
                int unit = sc.nextInt();
                System.out.println("Введите число:");
                int number = sc.nextInt();
                switch (unit) {
                    case 1:
                        System.out.println("Результат: \n" + "КГ: " + number + "\nГраммы: " + number * 1000);
                        break;
                    case 2:
                        System.out.println("Результат: \n" + "Граммы: " + number + "\nКГ: " + number / 1000d);
                        break;
                }
            }
            case 2: {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int unit = sc.nextInt();
                System.out.println("Введите число:");
                int number = sc.nextInt();
                switch (unit) {
                    case 1:
                        //System.out.printf("Результат: \nМетры: %d \nМили: %.5f \nЯрды: %.2f \nФунты: %.2f\n", number, number * 0.000621371, number * 1.09361, number * 3.28084);
                        System.out.println("Результат: \n" + "Метры: " + number + "\nМили: " + number * 0.000621371 + "\nЯрды: " + number * 1.09361 + "\nФунты: " + number * 3.28084);
                        break;
                    case 2:
                        System.out.println("Результат: \n" + "Мили: " + number + "\nМетры: " + number * 1760d + "\nЯрды: " + number * 1760d + "\nФунты: " + number * 5280d);
                        break;
                    case 3:
                        System.out.println("Результат: \n" + "Ярды: " + number + "\nМетры: " + number * 0.9144 + "\nМили: " + number / 1760d + "\nФунты: " + number * 3);
                        break;
                    case 4:
                        System.out.println("Результат: \n" + "Фунты: " + number + "\nМетры: " + number * 0.3048 + "\nМили: " + number / 5280d + "\nЯрды: " + number / 3d);
                        break;
                }

            }
        }
    }
}
