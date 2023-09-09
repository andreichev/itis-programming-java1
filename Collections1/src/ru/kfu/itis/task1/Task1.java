package ru.kfu.itis.task1;

import java.util.Scanner;

public class Task1 {
    // abcabc
    // true
    // abb
    // false
    static boolean firstHalfEqualsSecondHalf(String a) {
        if(a.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < a.length() / 2; i++) {
            if(a.charAt(i) != a.charAt(a.length() / 2 + i)) {
                return false;
            }
        }
        return true;
    }

    // abcabc
    // mama
    // xqer
    // abcd
    static boolean hasTwoMatching(String[] array) {
        int count = 0;
        for (String s : array) {
            if (firstHalfEqualsSecondHalf(s)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsCount = scanner.nextInt();
        scanner.nextLine();
        String[][] matrix = new String[rowsCount][];
        for (int i = 0; i < rowsCount; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.split(" ");
        }
        int columnsCount = matrix[0].length;

        boolean flag = false;
        for (int i = 0; i < columnsCount; i++) {
            String[] column = new String[rowsCount];
            for (int j = 0; j < rowsCount; j++) {
                column[j] = matrix[j][i];
            }
            if (hasTwoMatching(column)) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }
}
