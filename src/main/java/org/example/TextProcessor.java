package org.example;

public class TextProcessor {
    public static void main(String[] args) {

        System.out.println(turn("Hej Världen!"));
    }

    public static String upper(String s) {
        return s.toUpperCase();
    }

    public static String lower(String s) {
        return s.toLowerCase();
    }

    public static String turn(String s) {
        StringBuilder turnWord = new StringBuilder();

        turnWord.append(s);
        turnWord.toString();
        StringBuilder reverseStr = turnWord.reverse();

        return reverseStr.toString();
    }
}
