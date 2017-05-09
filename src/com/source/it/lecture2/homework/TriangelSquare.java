package com.source.it.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        double length = 0;
        double square = 0;

        length = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        length = length + Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
        length = length + Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));
        square = 0.5 * Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
