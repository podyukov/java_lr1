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
            System.out.println(m.chet(a));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public String chet (int x) {
        String s = "";
        for (int i = 0; i <= x; i = i + 2) s += i + " ";
        return s;
    }
}
