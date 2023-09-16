package sandbox;

// =^*^=

import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        System.out.println("Введите число");

        var number = new Scanner(System.in).nextInt();
        var numberX2 = number * 2;

        var spaces = numberX2 - 1;
        var chars = 1;

        for (var i = 0; i < numberX2; i++) {
            if (i < number) {
                System.out.println(" ".repeat(spaces) + "*".repeat(chars));
                spaces--;
                chars += 2;
                continue;
            }

            if (i == number) {
                chars = 1;
            }

            System.out.println(" ".repeat(spaces) + "*".repeat(chars) + " ".repeat(spaces * 2 + 1) + "*".repeat(chars));
            spaces--;
            chars += 2;
        }
    }
}
