package task_66;

import java.util.Scanner;

public class Task66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if(k < m * m) {
            x = Math.round(x);
            y -= 0.5;
            z -= 0.5;
        } else if(k == m * m) {
            x -= 0.5;
            y = Math.round(y);
            z -= 0.5;
        } else if (k > m * m) {
            x -= 0.5;
            y -= 0.5;
            z = Math.round(z);
        }

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
