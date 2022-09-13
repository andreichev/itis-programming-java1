package recursion;

import java.util.Scanner;

public class Recursion {
    static long func(long n) {
        if(n == 1L) { return 1L; }
        return func(n - 1L) * n;
    }

    public static void main(String[] args) {
        System.out.println("BEGIN");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        System.out.println("END");
    }
}
