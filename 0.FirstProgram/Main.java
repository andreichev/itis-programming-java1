import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length < 4) {
            System.out.println("4 args required");
            return;
        }
        float x1 = Float.valueOf(args[0]);
        float y1 = Float.valueOf(args[1]);
        float x2 = Float.valueOf(args[2]);
        float y2 = Float.valueOf(args[3]);

        float distance = (float) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println(distance);
    }
}
