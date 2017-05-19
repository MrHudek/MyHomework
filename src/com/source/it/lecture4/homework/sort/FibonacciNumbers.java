package com.source.it.lecture4.homework.sort;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int fibonacci = fibonacci(0);
        int n = 11;
        int a = 1, b = 1;
        int i = 2;
        //System.out.print(a + " " + b);
        while (i < n) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
            //System.out.print(" " + fibonacci); Если вдруг надо было вывести все числа фибоначи.
            i++;
        }
        System.out.print("Ваше число " + fibonacci);
    }

    private static int fibonacci(int n) {
            return 0;
    }
}

