package com.zinkworks;

public class Main {
    public static void main(String[] args) {

        int x = 98;
        int y = 0;
        System.out.println(divideEafp(x, y));
        System.out.println(divideLbyl(x, y));
    }

    private static int divideLbyl(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEafp(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}