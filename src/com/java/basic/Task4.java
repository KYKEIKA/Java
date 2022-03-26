package com.java.basic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double m = (double) (x + y + z)/3;
        System.out.println("Среднее арифметическое: " + m);
        if(Math.floor(m/2) > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
