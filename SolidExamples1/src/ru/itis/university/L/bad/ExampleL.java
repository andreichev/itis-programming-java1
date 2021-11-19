package ru.itis.university.L.bad;

import java.util.ArrayList;
import java.util.List;

// L - Liskov Substitution
// Необходимо, чтобы подклассы могли бы служить заменой для своих суперклассов.

public class ExampleL {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(5, 10));
        rectangles.add(new Rectangle(6, 10));
        rectangles.add(new Square(6));

        for(int i = 0; i < rectangles.size(); i++) {
            rectangles.get(i).setWidth(10);
        }

        for(int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).getSquare());
        }
    }
}
