package average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number;
        int count = 0;
        while (true) {
            number = scanner.nextDouble();
            if(number == 0) {
                break;
            }
            count++;
            sum += number;
        }
        System.out.println("Average: " + sum / count);
    }
}
