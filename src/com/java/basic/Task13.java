package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите произвольную строку:");
        String s = sc.nextLine();
        String str = s.trim();
        String[] result = str.split(" ");
        int latinWords = 0;
        for (String qw : result) {
            int latinLetter = 0;
            char[] array = qw.toCharArray();
            for (char ch : array){
                if(((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z'))){
                    latinLetter++;
                }
            }
            if (latinLetter == qw.length()){
                System.out.println(qw);
                latinWords++;
            }
        }
        System.out.println("Количество слов на латинице: " + latinWords);
    }
}
