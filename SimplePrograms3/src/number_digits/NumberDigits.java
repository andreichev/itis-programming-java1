package number_digits;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        int NOT_SET = -1;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[100];
        int digitsCount = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = NOT_SET;
        }

        while (number > 0) {
            int currentDigit = number % 10;
            number /= 10;
            array[digitsCount] = currentDigit;
            digitsCount++;
        }

        for(int i = digitsCount - 1; i >= 0; i--) {
            int currentDigit = array[i];
            System.out.print(currentDigit == 9 ? 0 : currentDigit + 1);
        }
    }
}
