package ru.itis.university.S.bad;

import ru.itis.university.common.Vector2;

import java.util.ArrayList;
import java.util.List;

public class ExampleS {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        Figure[] figures = new Figure[]{
                Figure.makeCircle(20., 20., 80., '0'),
                Figure.makeRect(10., 5., 30., 20., '#')
        };

        for(int y = 0; y < height; y++) {
            for(float x = 0; x < width; x += 0.4) {
                Vector2 currentPoint = new Vector2(x, y);
                boolean isInsideFigure = false;
                for(int i = 0; i < figures.length; i++) {
                    if(figures[i].isPointInside(currentPoint)) {
                        System.out.print(figures[i].getSym());
                        isInsideFigure = true;
                        break;
                    }
                }
                if (isInsideFigure == false) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
