package task2;
import java.util.Scanner;

public class Task2 {
    static boolean digitsSumEven(int x) {
        int digitSum = 0;
        while (x > 0) {
            digitSum += x % 10;
            x = x / 10;
        }
        return digitSum % 2 != 0;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int count = 0;
        while (true){
            int x = scanner.nextInt();
            if (x == 0){
                break;
            }
            if (digitsSumEven(x)) {
                array[count++] = x;
            }
        }
        for (int j = 0; j < count; j++ ){
            System.out.println(array[j]);
        }
    }
}
