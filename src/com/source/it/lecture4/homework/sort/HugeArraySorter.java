package com.source.it.lecture4.homework.sort;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);
        int[] sortedArray = new int[hugeArray.length];
        int min = hugeArray[0];
        int max = hugeArray[0];

        for (int index = 1; index < hugeArray.length; index++) {
            if (hugeArray[index] < min) {
                min = hugeArray[index];
            } else if (hugeArray[index] > max) {
                max = hugeArray[index];
            }
        }
        int[] counts = new int[max - min + 1];

        for (int index = 0;  index < hugeArray.length; index++) {
            counts[hugeArray[index] - min]++;
        }

        counts[0]--;
        for (int index = 1; index < counts.length; index++) {
            counts[index] = counts[index] + counts[index-1];
        }

        for (int index = hugeArray.length - 1; index >= 0; index--) {
            sortedArray[counts[hugeArray[index] - min]--] = hugeArray[index];
        }

        for (int index = 0; index < sortedArray.length - 1; index++) {
            if (sortedArray[index] > sortedArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }

        System.out.println("Sort successful!!");
    }
}
