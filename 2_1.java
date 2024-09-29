package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int a = scanner.nextInt();
            a = m.abs(a);
            System.out.println(a);
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public int abs (int x) {
        if (x < 0) return -x;
        else return x;
    }
}
