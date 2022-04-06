package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите простое линейное уравнение: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int x;
        if (Character.isLetter(ch[0])) {
            if (ch[1] == '+'){
                x = Character.getNumericValue(ch[4]) - Character.getNumericValue(ch[2]);
            } else{
                x = Character.getNumericValue(ch[4]) + Character.getNumericValue(ch[2]);
            }
        } else if (Character.isLetter(ch[2])) {
            if (ch[1] == '+'){
                x = Character.getNumericValue(ch[4]) - Character.getNumericValue(ch[0]);
            } else{
                x = Character.getNumericValue(ch[4]) + Character.getNumericValue(ch[0]);
            }
        } else {
            if (ch[1] == '+'){
                x = Character.getNumericValue(ch[0]) + Character.getNumericValue(ch[2]);
            } else{
                x = Character.getNumericValue(ch[0]) - Character.getNumericValue(ch[2]);
            }

        }
        System.out.println(str);
        System.out.println(x);
    }
}
