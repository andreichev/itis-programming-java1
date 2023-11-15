package ru.kfu.itis.example3;

// A
// B (A)
// C (B (A))

public class Example3 {
    public static void main(String[] args) {
        float x = 3.7f;
        System.out.println("X: " + x);
        int y = (int) x;
        System.out.println("Y: " + y);

        Pigeon object1 = new Pigeon();
        Bird object2 = object1;
        object2.fly();

        Bird[] array = {
                new Pigeon(),
                new Chicken(),
                new Pigeon(),
                new Chicken()
        };
        int count = 0;
        for (Bird bird : array) {
            if (bird instanceof FlyingBird) {
                count++;
            }
        }
        System.out.println(count);

        Pigeon pigeon = new Pigeon();
        needBird(pigeon);

        Chicken chicken = new Chicken();
        // needFlyingBird(chicken);

        needFlyingBird(new Pigeon());
    }

    static void needFlyingBird(FlyingBird flying) {
        System.out.println(flying.getName() + " is Flying Bird");
        flying.fly();
    }

    static void needBird(Bird b) {
    }
}
