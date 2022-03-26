package com.java.basic;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String s = sc.next();
        switch (s) {
            case "+":
                System.out.println("x + y = " + (x + y));
                break;
            case "-":
                System.out.println("x - y = " + (x - y));
                break;
            case "*":
                System.out.println("x * y = " + (x * y));
                break;
            case "/":
                System.out.println("x / y = " + (x / y));
                break;
        }
    }
}
