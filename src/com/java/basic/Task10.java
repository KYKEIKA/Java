package com.java.basic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Заполните массив:");
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            array[0][i] *= 3;
        }
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.deepToString(array));
    }
}
