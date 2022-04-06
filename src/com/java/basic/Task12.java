package com.java.basic;

public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean c = str.contains("Java");
        boolean sW = str.startsWith("I like");
        boolean eW = str.endsWith("!!!");
        if(c && sW && eW){
            System.out.println(str.toUpperCase());
        }
        String newStr = str.replace('a', 'o');
        System.out.println(newStr.substring(7, 11));
    }
}
