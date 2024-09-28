package ru.podyukov.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ от 0 до 9 (будет считан первый символ): ");
        int ch = m.charToNum(scanner.nextLine().charAt(0));
        if (ch >= 0 && ch <= 9) System.out.println("Результат: " + ch);
        else System.out.println("Получен неверный символ! Выход из программы!");
    }
    public int charToNum (char ch) {
        return (int) ch - 48;
    }
}