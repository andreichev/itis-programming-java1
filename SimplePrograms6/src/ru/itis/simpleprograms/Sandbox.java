package ru.itis.simpleprograms;

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
            if(findInString(digits, matrix[row]) != -1) {
                return true;
            }
        }
        return false;
    }

    static boolean isInAnyColumn(int number, int[][] matrix) {
        int[] digits = breaking(number);
        int maxString = 0;
        for(int row = 0; row < matrix.length; row++) {
            if(maxString < matrix[row].length) {
                maxString = matrix[row].length;
            }
        }
        for(int column = 0; column < maxString; column++) {
            int[] string = columnToString(matrix, column);
            if(findInString(digits, string) != -1) {
                return true;
            }
        }
        return false;
    }

    static int findInString(int[] s, int[] t) {
        for(int i = 0; i <= t.length - s.length; i++) {
            boolean allCorrect = true;
            for(int j = 0; j < s.length; j++) {
                if(t[i + j] != s[j]) {
                    allCorrect = false;
                    break;
                }
            }
            if(allCorrect) {
                return i;
            }
        }
        return -1;
    }

    static int[] columnToString(int[][] array, int n) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i].length <= n) {
                result[i] = -1;
            } else {
                result[i] = array[i][n];
            }
        }
        return result;
    }

    static boolean task(int[] numbers, int[][] digits) {
        for(int i = 0; i < numbers.length - 1; i++) {
            if(isInAnyString(numbers[i], digits)
                    && isInAnyColumn(numbers[i + 1], digits) == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{11, 123, 33};
        int[][] digits = new int[][]{
                {1, 1, 4},
                {7, 9, 4},
                {7, 9, 4}
        };

        if(task(numbers, digits)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
