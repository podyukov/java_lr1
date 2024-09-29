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
            int num = scanner.nextInt();
            boolean bl = m.isEqual(a, b, num);
            System.out.println(bl);
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public boolean isEqual (int a, int b, int c) {
        if ((a == b) && (b == c)) return true;
        else return false;
    }
}
