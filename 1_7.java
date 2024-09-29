package ru.podyukov.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите 1 границу: ");
            int a = scanner.nextInt();
            System.out.print("Введите 2 границу: ");
            int b = scanner.nextInt();
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            boolean bl = m.isInRange(a, b, num);
            System.out.println(bl);
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public boolean isInRange (int a, int b, int num) {
        if ((num <= a && num >= b) || (num >= a && num <= b)) return true;
        else return false;
    }
}
