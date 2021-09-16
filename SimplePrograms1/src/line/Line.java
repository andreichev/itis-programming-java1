package line;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(a + " * x + " + b);

        double pointX = scanner.nextDouble();
        double pointY = scanner.nextDouble();

        if(a * pointX + b > pointY) {
            System.out.println("Lower");        //ниже
        } else if(a * pointX + b == pointY) {
            System.out.println("On");           //на прямой
        } else {
            System.out.println("Higher");        //выше
        }
    }
}
