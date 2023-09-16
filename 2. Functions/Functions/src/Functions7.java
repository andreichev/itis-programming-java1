public class Functions7 {
    static void func(int x) {
        System.out.println(x);
        func(x + 1);
    }

    public static void main(String[] args) {
        func(1);
    }
}
