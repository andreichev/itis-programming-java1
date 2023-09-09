package ru.itis.simpleprograms.oop;

public class IsoscelesTriangle {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    private final float[] s = new float[3];

    public IsoscelesTriangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
        initializeSides();
    }

    public IsoscelesTriangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        initializeSides();
    }

    private void initializeSides() {
        s[0] = p1.distance(p2);
        s[1] = p1.distance(p3);
        s[2] = p2.distance(p3);
        if(s[0] != s[1] && s[0] != s[2] && s[1] != s[2]) {
            throw new RuntimeException("Wrong parameters");
        }
    }

    public float square() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p * (p - s[0]) * (p - s[1]) * (p - s[2]));
    }

    public float perimeter() {
        return s[0] + s[1] + s[2];
    }

    private boolean hasSideWithLength(float length) {
        for(int i = 0; i < 3; i++) {
            if (s[i] == length) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(o instanceof  IsoscelesTriangle == false) { return false; }
        IsoscelesTriangle that = (IsoscelesTriangle) o;
        for(int i = 0; i < 3; i++) {
            if(that.hasSideWithLength(s[i]) == false) {
                return false;
            }
        }
        return true;
    }

    public float[] getAngles() {
        float[] angles = new float[3];
        angles[0] = (float) Math.acos(
                (s[0] * s[0] + s[1] * s[1] - s[2] * s[2]) /
                        (2 * s[0] * s[1])
        );
        angles[1] = (float) Math.acos(
                (s[1] * s[1] + s[2] * s[2] - s[0] * s[0]) /
                        (2 * s[1] * s[2])
        );
        angles[2] = (float) Math.acos(
                (s[2] * s[2] + s[0] * s[0] - s[1] * s[1]) /
                        (2 * s[2] * s[0])
        );
        return angles;
    }

    @Override
    public String toString() {
        float[] angles = getAngles();
        return "Triangle, " +
            "square: " + square() + "\n" +
            "perimeter: " + perimeter() + "\n" +
            "angles: " + angles[0] + ", " + angles[1] + ", " + angles[2] + "\n" +
            "side 1: " + s[0] + "\n" +
            "side 2: " + s[1] + "\n" +
            "side 3: " + s[2] + "\n";
    }
}
