package ru.itis.simpleprograms;

import java.util.Scanner;

public class Sandbox {
    static int countN(int x) {
        int counterDigits = 0;
        while (x > 0) {
            counterDigits++;
            x /= 10;
        }
        return counterDigits;
    }

    static int[] breaking(int x) {
        int[] brokenNumber = new int[countN(x)];
        int countN = brokenNumber.length - 1;
        while (x > 0) {
            brokenNumber[countN] = x % 10;
            countN--;
            x /= 10;
        }
        return brokenNumber;
    }

    static boolean isInAnyString(int number, int[][] matrix) {
        int[] digits = breaking(number);
        for(int row = 0; row < matrix.length; row++) {
            if(digits.length > matrix[row].length) {
                return false;
            }
            if(isInString(digits, matrix[row])) {
                return true;
            }
        }
        return false;
    }

    static boolean isInAnyColumn(int number, int[][] matrix) {

    }

    static boolean isInString(int[] s, int[] t) {
        for(int i = 0; i < t.length - s.length; i++) {
            boolean allCorrect = true;
            for(int j = 0; j < s.length; j++) {
                if(t[i + j] != s[j]) {
                    allCorrect = false;
                    break;
                }
            }
            if(allCorrect) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[]{11, 123, 33};
        int[][] digits = new int[][]{
                {1, 1, 0},
                {2, 0, 0},
                {3, 0, 3},
                {1, 2, 3}
        };

        int i = findInString(new int[] {22, 33}, new int[] {1, 2, 32, 1, 22, 33, 12, 2});
        System.out.println(i);
    }
}
