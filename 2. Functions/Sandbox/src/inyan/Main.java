package inyan;

public class Main {
    public static void main(String[] args) {
        int size = 50;

        Circle bigCircle = new Circle(size / 2.0, size / 2.0, size / 2.0);
        Circle smallCircle1 = new Circle(size / 2.5, size / 4.0, size / 7.0);
        Circle smallCircle2 = new Circle(size - size / 2.5, size - size / 4.0, size / 7.0);

        for(float y = 0; y < size; y++) {
            for(float x = 0; x < size; x += 0.45) {
                Vector2 point = new Vector2(x, y);
                if(bigCircle.isPointInside(point)) {
                    if(0.5 * Math.sin(y * 6 / size) <= (2 * x / size) - 1) {
                        if(smallCircle2.isPointInside(point)) {
                            System.out.print("_");
                        } else {
                            System.out.print("+");
                        }
                    } else {
                        if(smallCircle1.isPointInside(point)) {
                            System.out.print("+");
                        } else {
                            System.out.print("_");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
