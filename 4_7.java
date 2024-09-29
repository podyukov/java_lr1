package ru.podyukov.java;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] arr = new int[] {1,2,3,4,5,3,7};
        System.out.print("Массив arr: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        int[] new_mas = m.reverseBack(arr);
        System.out.print("Результат: ");
        for (int i = 0; i < new_mas.length; i++) System.out.print(new_mas[i] + " ");
    }
    public int[] reverseBack (int[] arr) {
        int[] new_mas = new int[arr.length];
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) new_mas[i] = arr[j];
        return new_mas;
    }
}
