package circleandrectangle;

public class CircleAndRectangle {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        int rectangleX = 10;
        int rectangleY = 5;
        int rectangleWidth = 30;
        int rectangleHeight = 20;

        int circleCenterX = 30;
        int circleCenterY = 40;
        int circleRadius = 10;

        for(int y = 0; y < height; y++) {
            for(float x = 0; x < width; x += 0.4) {
                float distance = (float) Math.sqrt((x - circleCenterX) * (x - circleCenterX) + (y - circleCenterY) * (y - circleCenterY));

                if(x >= rectangleX && x <= rectangleX + rectangleWidth
                        && y >= rectangleY && y <= rectangleY + rectangleHeight) {
                    System.out.print("#");
                } else if(distance <= circleRadius) {
                    System.out.print("0");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
