package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] arr = new int[] {1,2,3,8,2,2,9};
        int n;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            n = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
            return;
        }
        System.out.print("Массив arr: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        int[] new_mas = m.findAll(arr, n);
        System.out.print("Результат: ");
        for (int i = 0; i < new_mas.length; i++) System.out.print(new_mas[i] + " ");
    }
    public int[] findAll (int[] arr, int x) {
        int x_amount = 0; // считаем количество вхождений, чтобы создать массив с его количеством
        for (int i = 0; i < arr.length; i++) if (arr[i] == x) x_amount++;
        if (x_amount == 0) {
            System.out.println("Вхождений не найдено! Возвращён 0!");
            int[] new_mas = new int[] {0};
            return new_mas;
        }
        int[] new_mas = new int[x_amount];
        int inew_mas = 0; // итератор для new_mas
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) { // если найдено совпадение
                new_mas[inew_mas] = i;
                inew_mas++;
            }
        }
        return new_mas;
    }
}
