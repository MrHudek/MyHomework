package com.source.it.lecture2.homework;

public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        /*int temp = first;
        first = second;
        second = temp;*/

        first = first * second; // 5 * 10 = 50
        second = first / second; // 50 / 10 = 5
        first = first / second; // 50 / 5 = 10

        System.out.println("First = " + first + " , second = " + second);
    }
}
