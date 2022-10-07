package ru.itis.programs.acmp_task27;

import java.util.Scanner;

public class AcmpTask27 {
    static class Vector2 {
        int x;
        int y;

        Vector2(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Rect {
        Vector2 leftTop;
        Vector2 rightBottom;

        Rect(int x1, int y1, int x2, int y2) {
            leftTop = new Vector2(x1, y1);
            rightBottom = new Vector2(x2, y2);
        }
    }

    static class Field {
        int w, h;
        byte[][] field;

        Field(int w, int h) {
            this.w = w;
            this.h = h;
            field = new byte[h][w];
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    field[y][x] = 0;
                }
            }
        }

        void setRectToOnes(Rect rect) {
            for (int y = rect.leftTop.y; y < rect.rightBottom.y; y++) {
                for (int x = rect.leftTop.x; x < rect.rightBottom.x; x++) {
                    field[y][x] = 1;
                }
            }
        }

        int getZerosCount() {
            int zeroCount = 0;
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if(field[y][x] == 0) {
                        zeroCount++;
                    }
                }
            }
            return zeroCount;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field field = new Field(
                scanner.nextInt(),
                scanner.nextInt()
        );

        int rectanglesCount = scanner.nextInt();
        for (int i = 0; i < rectanglesCount; i++) {
            Rect rect = new Rect(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
            );
            field.setRectToOnes(rect);
        }

        System.out.println(field.getZerosCount());
    }
}
