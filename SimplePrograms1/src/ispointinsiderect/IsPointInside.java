package ispointinsiderect;

import java.util.Scanner;

public class IsPointInside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if(x >= 0 && x <= 1 && y >= 0 && y <= 1) {
            System.out.println("Входит");
        } else {
            System.out.println("Не входит");
        }
    }
}
