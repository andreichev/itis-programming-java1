package com.itis.collections2.example3;

import com.itis.collections2.example2.base.MyList;
import com.itis.collections2.example2.impl.MyListOptimized;

public class Example3 {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        MyList<Figure> figures = new MyListOptimized<>();
        figures.add(new Circle(20., 10., 80., '0'));
        figures.add(new Rectangle(10., 5., 30., 20., '#'));
        figures.add(new Circle(10., 30., 40., '!'));
        figures.add(new Rectangle(20., 25., 5, 5, '+'));
        figures.add(new Circle(10., 10., 10., '*'));
        figures.add(new Rectangle(80., 5., 10, 10, '^'));

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
