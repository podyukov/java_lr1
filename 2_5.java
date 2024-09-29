package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите 1 число: ");
            int a = scanner.nextInt();
            System.out.print("Введите 2 число: ");
            int b = scanner.nextInt();
            System.out.print("Введите 3 число: ");
            int c = scanner.nextInt();
            System.out.println(m.max3(a, b, c));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public int max3 (int x, int y, int z) {
        int max = x; // назначаем x за максимум
        if (y > max) max = y; // если y больше максимума, назначаем y как максимум
        if (z > max) max = z; // если z больше максимума, назначаем z как максимум
        return max;
    }
}
