package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        System.out.println("И сами строки: ");
        String[] arrayRow = new String[n];
        for (int i = 0; i < arrayRow.length; i++) {
            arrayRow[i] = sc.next();
        }
        String maxWord = "";
        int maxSigns = 0;
        for (String str : arrayRow) {
            char[] array = str.toCharArray();
            int countSigns = 0;
            boolean flag;
            for (int i = 0; i < array.length; i++) {
                flag = false;
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    countSigns++;
                }
            }
            if(maxSigns < countSigns){
                maxSigns = countSigns;
                maxWord = str;
            }
        }
        System.out.println(maxWord);
        System.out.println(Arrays.toString(arrayRow));
    }
}
