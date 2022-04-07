package com.java.basic;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Загадка: \n“Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ответ: ");
            String str = sc.nextLine();
            if (str.equals("Заархивированный вирус")) {
                System.out.println("Правильно");
                break;
            } else if (str.equals("Подсказка") && i == 1) {
                System.out.println("вирус.rar");
                System.out.println("Ответ: ");
                String str1 = sc.nextLine();
                if (str1.equals("Заархивированный вирус")) {
                    System.out.println("Правильно");
                    break;
                }else {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
            } else if (str.equals("Подсказка")) {
                if (i == 2) {
                    System.out.println("Подсказка уже недоступна");
                }
                if (i == 3) {
                    System.out.println("Подсказка уже недоступна \nОбидно, приходи в другой раз");
                }
            } else {
                if (i == 1 || i == 2) {
                    System.out.println("Подумай еще!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
