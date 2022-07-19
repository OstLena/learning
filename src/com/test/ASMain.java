package com.test;

public class ASMain {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int first = array[i];
                int second = array[j];
                if (first > second) {
                    int t = first;
                    array[i] = second;
                    array[j] = t;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
