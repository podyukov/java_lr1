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
            m.rightTriangle(a);
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public void rightTriangle (int x) {
        for (int i = 0; i < x; i++) { // цикл переводит на новую строку и рисует * в конце
            for (int j = 0; j < x - i - 1; j++) System.out.print(' '); // рисует пробел от начала до конца с учетом прохода первого цикла, звездочки получаются по диагонали
            for (int j = x - i; j < x + 1; j++) System.out.print('*'); // рисует от диагонали до конца звездочки
            System.out.println();
        }
    }
}
