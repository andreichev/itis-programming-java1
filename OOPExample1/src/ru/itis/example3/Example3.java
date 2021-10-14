package ru.itis.example3;

import ru.itis.example1.Vector2;

public class Example3 {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        Circle[] circles = {
                new Circle(20., 10., 80., '0'),
                new Circle(10., 30., 40., '!'),
                new Circle(10., 10., 10., '*'),
        };

        Rectangle[] rectangles = {
                new Rectangle(10., 5., 30., 20., '#'),
                new Rectangle(20., 25., 5, 5, '+'),
                new Rectangle(80., 5., 10, 10, '^'),
        };

        for(int y = 0; y < height; y++) {
            for(float x = 0; x < width; x += 0.4) {
                Vector2 currentPoint = new Vector2(x, y);
                boolean isInsideFigure = false;
                for(int i = 0; i < circles.length; i++) {
                    if(circles[i].isPointInside(currentPoint)) {
                        System.out.print(circles[i].symbol);
                        isInsideFigure = true;
                        break;
                    }
                }
                if(isInsideFigure == false) {
                    for (int i = 0; i < rectangles.length; i++) {
                        if (rectangles[i].isPointInside(currentPoint)) {
                            System.out.print(rectangles[i].symbol);
                            isInsideFigure = true;
                            break;
                        }
                    }
                }
                if (isInsideFigure == false) {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
