package task71_acmp_v1;

import java.util.Scanner;

public class Task71AcmpV1 {
    // 3
    // 1 13 14
    // 0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        int minDelta = Integer.MAX_VALUE;
        for (int i = 0; i < Math.pow(2, n); i++) {
            int t = i;
            int delta = 0;
            for (int j = 0; j < n; j++) {
                if(t % 2 == 1) {
                    delta += x[j];
                } else {
                    delta -= x[j];
                }
                t /= 2;
            }
            if(Math.abs(delta) < minDelta) {
                minDelta = Math.abs(delta);
            }
        }

        System.out.println(minDelta);
    }
}
