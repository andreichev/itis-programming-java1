package task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(multiply(a, b));
    }
    public static int multiply(int a, int b){
        int x = 0;
        for (int i = 0; i < b; i++){
            x = x + a;
        }
        return x;
    }
}
