package task836_acmp;

import java.util.Scanner;

public class Task836Acmp {
    // Возвращает true, если третья справа цифра
    // в восмеричной системе нечетна
    static boolean isHexThirdFromRightDigitOdd(long x) {
        return ((x / 64) % 8) % 2 == 1;
    }

    static void sort(long[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    long t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = Long.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            long x = scanner.nextInt();
            if (x % 2 != 0) {
                continue;
            }
            if (isHexThirdFromRightDigitOdd(x)) {
                result[counter] = x;
                counter++;
            }
        }

        sort(result);
        System.out.println(counter);
        for (int i = 0; i < counter; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
