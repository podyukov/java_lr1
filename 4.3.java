package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] array = new int[] {1,-2,-7,4,2,2,5};
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
        System.out.println("Результат: " + m.maxAbs(array));
    }
    public int maxAbs (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) max = Math.abs(arr[i]);
        }
        return max;
    }
}
