package ru.itis.javalessons.task1;

import java.util.Scanner;

public class Task1 {
    // 5
    // 534 323 542 367 975
    // 5
    // 1 2 3 5 3
    // 3 4 2 5 1
    // 3 4 3 2 3
    // 2 2 4 3 4
    // 4 5 1 1 5

    // получить кол-во цифр в числе
    static int digitsCount(int n) {
        int result = 0;
        while (n > 0) {
            result++;
            n /= 10;
        }
        return result;
    }

    // разбить число на цифры
    static int[] breakNumber(int n) {
        int digits = digitsCount(n);
        int[] result = new int[digits];
        for (int i = digits - 1; i >= 0; i--) {
            result[i] = n % 10;
            n /= 10;
        }
        return result;
    }

    // поиск подмассива b в массиве a
    // возвращает -1 если не найдено
    // a = [1, 2, 3, 4, 5, 6, 7]
    // b = [3, 4, 5]
    // 2
    static int find(int[] a, int[] b) {
        for (int index = 0; b.length + index <= a.length; index++) {
            boolean found = true;
            for (int i = 0; i < b.length; i++) {
                if(a[i + index] != b[i]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return index; }
        }
        return -1;
    }

    // поиск числа разбитого на цифры в массиве
    static boolean hasDigit(int x, int[] line) {
        return find(line, breakNumber(x)) != -1;
    }

    // содержится ли в любой строке матрицы число разбитое на цифры
    static boolean hasDigitInAnyMatrixRow(int x, int[][] digits) {
        for (int[] digit : digits) {
            if (hasDigit(x, digit)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[][] digits = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                digits[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if(hasDigitInAnyMatrixRow(numbers[i], digits)
                || hasDigitInAnyMatrixRow(numbers[i + 1], digits)) {
                count++;
            }
        }
        if(hasDigitInAnyMatrixRow(numbers[n - 1], digits)) {
            count++;
        }
        System.out.println(count);
        if(count == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
