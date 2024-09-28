package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            boolean b = m.is2Digits(scanner.nextInt());
            System.out.println(b);
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public boolean is2Digits (int x) {
        if ((x / 10) >= 1 && (x / 10) <= 9) return true;
        else return false;
    }
}
