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
        object2.printName();

        Bird[] array = {
                new Pigeon(),
                new Chicken(),
                new Pigeon(),
                new Chicken()
        };
        for(Bird bird : array) {
            bird.printName();
        }

        Pigeon pigeon = new Pigeon();
        needBird(pigeon);

        // Chicken chicken = new Chicken();
        // needFlyingBird(chicken);
    }

    static void needFlyingBird(FlyingBird flying) {
        flying.printName();
    }

    static void needBird(Bird b) {
        b.printName();
    }
}
