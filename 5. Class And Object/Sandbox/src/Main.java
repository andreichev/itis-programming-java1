public class Main {
    static void func(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        int x;
        x = 5;
        func(x);
        System.out.println(x);
    }
}