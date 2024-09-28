package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        try {
            float n = (float) m.fraction(scanner.nextDouble()); // приводим ко float, чтобы не было 0,120000001
            System.out.println("Результат: " + n);
        } catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные! Выход из программы!");
        }
    }
    public double fraction (double x) {
        return x % 1; // берем остаток от деления на 1
    }
}
