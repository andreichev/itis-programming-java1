package task_869;

import java.util.Arrays;
import java.util.Scanner;

public class Task869 {
    // 4 135
    // 50 74 60 82
    // 2

    static void sort(int[] m) {
        Arrays.sort(m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        sort(m);
        int j = 0;
        int i = n - 1;
        int result = 0;
        while (j <= i) {
            if(m[i] + m[j] <= d) {
                j++;
            }
            result += 1;
            i--;
        }
        System.out.println(result);
    }
}
