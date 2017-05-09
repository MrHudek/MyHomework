package com.source.it.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 2;
        int mins = 30;
        int result = 0;

        result = (int) (2.5 * 360 / 12 - 30 / 60 * 360); //Тут ровно 75 получается, по этому решил оставить int

        System.out.println("Angle between hours and minute narrows is " + result);
    }
}
