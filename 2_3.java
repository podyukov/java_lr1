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
            System.out.println(m.is35(a));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public boolean is35 (int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) return false; // если делится на 3 и на 5 то false
        else if (x % 3 == 0) return true; // иначе если делится на 3 то true
        else if (x % 5 == 0) return true; // иначе если делится на 5 то true
        else return false; // иначе false
    }
}
