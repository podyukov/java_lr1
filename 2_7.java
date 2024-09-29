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
            System.out.println(m.sum2(a, b));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public int sum2 (int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        else return sum;
    }
}
