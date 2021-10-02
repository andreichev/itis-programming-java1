package recursion_factorial;

import java.util.Scanner;

public class Factorial {
    static int factorial(int x) {
        if(x > 0) {
            return x * factorial(x - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
