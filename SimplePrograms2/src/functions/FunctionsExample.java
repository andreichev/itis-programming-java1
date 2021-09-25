package functions;

public class FunctionsExample {
    static int someMethod(int c) {
        c++;
        System.out.println("c: " + c);
        return c;
    }

    public static void main(String[] args) {
        System.out.println("result: " + someMethod(someMethod(someMethod(1))));
    }
}
