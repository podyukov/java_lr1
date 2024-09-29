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
            m.square(a);
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public void square (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) System.out.print('*');
            System.out.println();
        }
    }
}
