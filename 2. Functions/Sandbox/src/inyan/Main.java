package inyan;

public class Main {
    static boolean isPointInsideCircle(float x, float y, float circleCenterX, float circleCenterY, float radius) {
        double distance = Math.sqrt((x - circleCenterX) * (x - circleCenterX) + (y - circleCenterY) * (y - circleCenterY));
        return distance <= radius;
    }

    public static void main(String[] args) {
        int size = 50;
        int bigCircleCenterX = size / 2;
        int bigCircleCenterY = size / 2;
        int bigCircleRadius = size / 2;

        float smallCircle1CenterX = size / 2.5f;
        float smallCircle1CenterY = size / 4.0f;
        float smallCircle1Radius = size / 7.f;

        float smallCircle2CenterX = size - size / 2.5f;
        float smallCircle2CenterY = size - size / 4.0f;
        float smallCircle2Radius = size / 7.f;

        for(float y = 0; y < size; y++) {
            for(float x = 0; x < size; x += 0.45) {
                if(isPointInsideCircle(x, y, bigCircleCenterX, bigCircleCenterY, bigCircleRadius)) {
                    if(0.5 * Math.sin(y * 6 / size) <= (2 * x / size) - 1) {
                        if(isPointInsideCircle(x, y, smallCircle2CenterX, smallCircle2CenterY, smallCircle2Radius)) {
                            System.out.print("_");
                        } else {
                            System.out.print("+");
                        }
                    } else {
                        if(isPointInsideCircle(x, y, smallCircle1CenterX, smallCircle1CenterY, smallCircle1Radius)) {
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
