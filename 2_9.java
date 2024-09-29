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
            System.out.println(m.day(a));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено неверное значение! Выход!");
        }
    }
    public String day (int x) {
        String d;
        switch (x) {
            case 1: {
                d = "Понедельник";
                break;
            }
            case 2: {
                d = "Вторник";
                break;
            }
            case 3: {
                d = "Среда";
                break;
            }
            case 4: {
                d = "Четверг";
                break;
            }
            case 5: {
                d = "Пятница";
                break;
            }
            case 6: {
                d = "Суббота";
                break;
            }
            case 7: {
                d = "Воскресенье";
                break;
            }
            default: {
                d = "Это не день недели";
            }
        }
        return d;
    }
}
