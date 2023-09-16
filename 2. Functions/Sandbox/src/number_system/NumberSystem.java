package number_system;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSystem = scanner.nextInt();
        String numberStr = scanner.next();
        long result = 0;

        for(int i = 0; i < numberStr.length(); i++) {
            int currentDigit = Character.getNumericValue(numberStr.charAt(i));
            if(currentDigit > numberSystem - 1) {
                System.out.println("Wrong number entered");
                return;
            }
            result += currentDigit * Math.pow(numberSystem, numberStr.length() - i - 1);
        }

        System.out.println(result);
    }
}
