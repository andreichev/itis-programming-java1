import java.util.Scanner;

public class Functions3 {
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max = max(a, max(b, max(c, d)));
        System.out.println(max);
    }
}
