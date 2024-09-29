package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] arr = new int[] {1,2,3,4,5};
        int[] ins = new int[] {7,8,9};
        int pos;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите позицию: ");
            pos = scanner.nextInt();
            if (pos > arr.length) {
                System.out.println("pos не должно выходить за границы массива! Выход!");
                return;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
            return;
        }
        System.out.print("Массив arr: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.print("Массив ins: ");
        for (int i = 0; i < ins.length; i++) System.out.print(ins[i] + " ");
        System.out.println();
        int[] new_mas = m.add(arr, ins, pos);
        System.out.print("Результат: ");
        for (int i = 0; i < new_mas.length; i++) System.out.print(new_mas[i] + " ");
    }
    public int[] add (int[] arr, int[] ins, int pos) {
        int[] new_mas = new int[arr.length + ins.length]; // создаем новый массив длиной 1 + 2 массивы
        int iarr = 0, inew_mas = 0; // итераторы arr и new_mas
        for (; iarr < pos; iarr++, inew_mas++) new_mas[inew_mas] = arr[iarr]; // заполняем до позиции
        for (int iins = 0; iins < ins.length; iins++, inew_mas++) new_mas[inew_mas] = ins[iins]; // в позицию вставляем ins
        for (; inew_mas < new_mas.length; inew_mas++, iarr++) new_mas[inew_mas] = arr[iarr]; // заполняем после ins
        return new_mas;
    }
}
