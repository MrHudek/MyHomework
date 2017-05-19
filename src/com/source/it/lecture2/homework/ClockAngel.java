package com.source.it.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 2;
        int mins = 30;
        int result = 0;

        result = (int) (((float) mins / 60 * 360) - (hours * 360 / 12));
        //result = (int) (((float)mins / 60 * 360) - (2.5 * 360 / 12)); = 105 Это правильный ответ

        System.out.println("Angle between hours and minute narrows is " + result);
    }
}
