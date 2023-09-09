package ispointinsidecircle;

import java.util.Scanner;

public class IsPointInsideCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double R = scanner.nextDouble();
        double pointX = scanner.nextDouble();
        double pointY = scanner.nextDouble();

        System.out.println(R + "^2 = (x-" + a + ")^2+(y-" + b + ")^2");

        double distance = Math.sqrt((a - pointX) * (a - pointX) + (b - pointY) * (b - pointY));

        if(distance > R) {
            System.out.println("Out");
        } else if(distance == R) {
            System.out.println("On");
        } else {
            System.out.println("In");
        }
    }
}
