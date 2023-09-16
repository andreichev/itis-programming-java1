public class Functions6 {
    static int func1(int x) {
        return func2(x + 1);
    }

    static int func2(int x) {
        return func3(x - 2);
    }

    static int func3(int x) {
        return x / 0;
    }

    public static void main(String[] args) {
        int x = func2(func1(4));
        System.out.println(x);
    }
}
