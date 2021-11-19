package ru.itis.university.S.good;

import ru.itis.university.common.Vector2;

import java.util.ArrayList;
import java.util.List;

// S - Single responsibility
// Класс должен быть ответственен лишь за что-то одно.
public class ExampleS {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(20., 10., 80., '0'));
        figures.add(new Rectangle(10., 5., 30., 20., '#'));

        for(int y = 0; y < height; y++) {
            for(float x = 0; x < width; x += 0.4) {
                Vector2 currentPoint = new Vector2(x, y);
                boolean isInsideFigure = false;
                for(int i = 0; i < figures.size(); i++) {
                    if(figures.get(i).isPointInside(currentPoint)) {
                        System.out.print(figures.get(i).getSym());
                        isInsideFigure = true;
                        break;
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
