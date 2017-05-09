package com.source.it.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        double length = 0;
        double square = 0;

        length = Math.sqrt(Math.pow(10 - 1,2) + Math.pow(7 - 1,2)) + Math.sqrt(Math.pow(-3 - 1,2) + Math.pow(4 - 1,2));
        length = length + Math.sqrt(Math.pow(-3 - 10,2) + Math.pow(4 - 7,2));
        square = 0.5 * Math.abs((1 + 3) * (7 - 4) - (10 + 3) * (1 - 4));


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
