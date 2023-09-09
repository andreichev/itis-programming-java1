package quadraticequation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("(" + a + " * x) ^ 2 + " + b + " * x + " + c + " = 0");
        double d = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        if(d > 0) {
            System.out.println("Два корня:");
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if(d == 0) {
            System.out.println("Один корень:");
            System.out.println("x = " + x1);
        } else {
            System.out.println("Нет корней");
        }
    }
}
