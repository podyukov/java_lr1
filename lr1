import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ebl = true;
        while (ebl) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("> Введите номер задания (1.1 это 11) (0 для выхода): ");
            try {
                int nn = scanner1.nextInt();
                switch (nn) {
                    case 0: {
                        ebl = false;
                        break;
                    }
                    case 11: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Введите дробное число: ");
                        try {
                            float n = (float) m.fraction(scanner.nextDouble()); // приводим ко float, чтобы не было 0,120000001
                            System.out.println("Результат: " + n);
                        } catch (InputMismatchException e) {
                            System.out.println("Введены некорректные данные! Выход из программы!");
                        }
                        break;
                    }
                    case 13: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Введите символ от 0 до 9 (будет считан первый символ): ");
                        int ch = m.charToNum(scanner.nextLine().charAt(0));
                        if (ch >= 0 && ch <= 9) System.out.println("Результат: " + ch);
                        else System.out.println("Получен неверный символ! Выход из программы!");
                        break;
                    }
                    case 15: {
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
                        break;
                    }
                    case 17: {
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
                        break;
                    }
                    case 19: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите 1 число: ");
                            int a = scanner.nextInt();
                            System.out.print("Введите 2 число: ");
                            int b = scanner.nextInt();
                            System.out.print("Введите 3 число: ");
                            int num = scanner.nextInt();
                            boolean bl = m.isEqual(a, b, num);
                            System.out.println(bl);
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                        }
                        break;
                    }
                    case 21: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите число: ");
                            int a = scanner.nextInt();
                            a = m.abs(a);
                            System.out.println(a);
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                        }
                        break;
                    }
                    case 23: {
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
                        break;
                    }
                    case 25: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите 1 число: ");
                            int a = scanner.nextInt();
                            System.out.print("Введите 2 число: ");
                            int b = scanner.nextInt();
                            System.out.print("Введите 3 число: ");
                            int c = scanner.nextInt();
                            System.out.println(m.max3(a, b, c));
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                        }
                        break;
                    }
                    case 27: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите 1 число: ");
                            int a = scanner.nextInt();
                            System.out.print("Введите 2 число: ");
                            int b = scanner.nextInt();
                            System.out.println(m.sum2(a, b));
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                        }
                        break;
                    }
                    case 29: {
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
                        break;
                    }
                    case 31: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите число: ");
                            int a = scanner.nextInt();
                            System.out.println(m.listNums(a));
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                        }
                        break;
                    }
                    case 33: {
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
                        break;
                    }
                    case 35: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите число: ");
                            int a = scanner.nextInt();
                            System.out.println(m.numLen(a));
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                        }
                        break;
                    }
                    case 37: {
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
                        break;
                    }
                    case 39: {
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
                        break;
                    }
                    case 41: {
                        Main m = new Main();
                        Scanner scanner = new Scanner(System.in);
                        int[] array = new int[] {1,2,3,4,2,2,5};
                        try {
                            System.out.print("Введите число: ");
                            int a = scanner.nextInt();
                            System.out.println(m.findFirst(array, a));
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                        }
                        break;
                    }
                    case 43: {
                        Main m = new Main();
                        int[] array = new int[] {1,-2,-7,4,2,2,5};
                        System.out.print("Массив: ");
                        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
                        System.out.println();
                        System.out.println("Результат: " + m.maxAbs(array));
                        break;
                    }
                    case 45: {
                        Main m = new Main();
                        int[] arr = new int[] {1,2,3,4,5};
                        int[] ins = new int[] {7,8,9};
                        int pos;
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите позицию: ");
                            pos = scanner.nextInt();
                            if (pos > arr.length) {
                                System.out.println("pos не должно выходить за границы массива! Выход!");
                                return;
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                            return;
                        }
                        System.out.print("Массив arr: ");
                        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
                        System.out.println();
                        System.out.print("Массив ins: ");
                        for (int i = 0; i < ins.length; i++) System.out.print(ins[i] + " ");
                        System.out.println();
                        int[] new_mas = m.add(arr, ins, pos);
                        System.out.print("Результат: ");
                        for (int i = 0; i < new_mas.length; i++) System.out.print(new_mas[i] + " ");
                        break;
                    }
                    case 47: {
                        Main m = new Main();
                        int[] arr = new int[] {1,2,3,4,5,3,7};
                        System.out.print("Массив arr: ");
                        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
                        System.out.println();
                        int[] new_mas = m.reverseBack(arr);
                        System.out.print("Результат: ");
                        for (int i = 0; i < new_mas.length; i++) System.out.print(new_mas[i] + " ");
                        break;
                    }
                    case 49: {
                        Main m = new Main();
                        int[] arr = new int[] {1,2,3,8,2,2,9};
                        int n;
                        Scanner scanner = new Scanner(System.in);
                        try {
                            System.out.print("Введите число: ");
                            n = scanner.nextInt();
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Введено неверное значение! Выход!");
                            return;
                        }
                        System.out.print("Массив arr: ");
                        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
                        System.out.println();
                        int[] new_mas = m.findAll(arr, n);
                        System.out.print("Результат: ");
                        for (int i = 0; i < new_mas.length; i++) System.out.print(new_mas[i] + " ");
                        break;
                    }
                    default: {
                        System.out.println("Неверный номер задачи!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Введены некорректные данные! Выход из программы!");
            }
        }
    }
    public double fraction (double x) {
        return x % 1; // берем остаток от деления на 1
    }
    public int charToNum (char ch) {
        return (int) ch - 48;
    }
    public boolean is2Digits (int x) {
        if ((x / 10) >= 1 && (x / 10) <= 9) return true;
        else return false;
    }
    public boolean isInRange (int a, int b, int num) {
        if ((num <= a && num >= b) || (num >= a && num <= b)) return true;
        else return false;
    }
    public boolean isEqual (int a, int b, int c) {
        if ((a == b) && (b == c)) return true;
        else return false;
    }
    public int abs (int x) {
        if (x < 0) return -x;
        else return x;
    }
    public boolean is35 (int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) return false; // если делится на 3 и на 5 то false
        else if (x % 3 == 0) return true; // иначе если делится на 3 то true
        else if (x % 5 == 0) return true; // иначе если делится на 5 то true
        else return false; // иначе false
    }
    public int max3 (int x, int y, int z) {
        int max = x; // назначаем x за максимум
        if (y > max) max = y; // если y больше максимума, назначаем y как максимум
        if (z > max) max = z; // если z больше максимума, назначаем z как максимум
        return max;
    }
    public int sum2 (int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        else return sum;
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
    public String listNums (int x) {
        String s = "";
        for (int i = 0; i <= x; i++) s += i + " ";
        return s;
    }
    public String chet (int x) {
        String s = "";
        for (int i = 0; i <= x; i = i + 2) s += i + " ";
        return s;
    }
    public int numLen (long x) {
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count ++;
        }
        return count;
    }
    public void square (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) System.out.print('*');
            System.out.println();
        }
    }
    public void rightTriangle (int x) {
        for (int i = 0; i < x; i++) { // цикл переводит на новую строку и рисует * в конце
            for (int j = 0; j < x - i - 1; j++) System.out.print(' '); // рисует пробел от начала до конца с учетом прохода первого цикла, звездочки получаются по диагонали
            for (int j = x - i; j < x + 1; j++) System.out.print('*'); // рисует от диагонали до конца звездочки
            System.out.println();
        }
    }
    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
    public int maxAbs (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) max = Math.abs(arr[i]);
        }
        return max;
    }
    public int[] add (int[] arr, int[] ins, int pos) {
        int[] new_mas = new int[arr.length + ins.length]; // создаем новый массив длиной 1 + 2 массивы
        int iarr = 0, inew_mas = 0; // итераторы arr и new_mas
        for (; iarr < pos; iarr++, inew_mas++) new_mas[inew_mas] = arr[iarr]; // заполняем до позиции
        for (int iins = 0; iins < ins.length; iins++, inew_mas++) new_mas[inew_mas] = ins[iins]; // в позицию вставляем ins
        for (; inew_mas < new_mas.length; inew_mas++, iarr++) new_mas[inew_mas] = arr[iarr]; // заполняем после ins
        return new_mas;
    }
    public int[] reverseBack (int[] arr) {
        int[] new_mas = new int[arr.length];
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) new_mas[i] = arr[j];
        return new_mas;
    }
    public int[] findAll (int[] arr, int x) {
        int x_amount = 0; // считаем количество вхождений, чтобы создать массив с его количеством
        for (int i = 0; i < arr.length; i++) if (arr[i] == x) x_amount++;
        if (x_amount == 0) {
            System.out.println("Вхождений не найдено! Возвращён 0!");
            int[] new_mas = new int[] {0};
            return new_mas;
        }
        int[] new_mas = new int[x_amount];
        int inew_mas = 0; // итератор для new_mas
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) { // если найдено совпадение
                new_mas[inew_mas] = i;
                inew_mas++;
            }
        }
        return new_mas;
    }
}
