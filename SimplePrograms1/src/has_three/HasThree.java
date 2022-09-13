package has_three;

import java.util.Scanner;

public class HasThree {
    static boolean hasDigitThree(int x) {
        while (x > 0) {
            int d = x % 10;
            if (d == 3) {
                return true;
            }
            x /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasThree = false;
        while (true) {
            int x = scanner.nextInt();
            if(x == 0) { break; }
            if(hasDigitThree(x)) { hasThree = true; }
        }
        if(hasThree) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
