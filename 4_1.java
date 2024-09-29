package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[] {1,2,3,4,2,2,5};
        try {
            System.out.print("Введите число: ");
            int a = scanner.nextInt();
            System.out.println(m.findFirst(array, a));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
}
