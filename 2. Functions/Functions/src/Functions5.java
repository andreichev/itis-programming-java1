public class Functions5 {
    static void func(int x) {
        if(x < 10) {
            System.out.println(x);
            func(x + 1);
        }
    }

    public static void main(String[] args) {
        func(0);

        for (int i = 0; i < 9; i++) {
            System.out.println(i);
        }
    }
}
