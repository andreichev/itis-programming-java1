package task71_acmp_v2;

import java.util.Scanner;

public class Task71AcmpV2 {
    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void func(int[] x) {
        sort(x);
        print(x);
        if(x.length % 2 == 1) {
            int[] a = new int[x.length / 2 + 1];
            int j = 1;
            a[0] = x[0];
            for (int i = 2; i < x.length; i += 2) {
                a[j] = x[i] - x[i - 1];
                j++;
            }
            if(a.length != 1) {
                System.out.println("---");
                print(a);
                func(a);
            } else {
                System.out.println(a[0]);
            }
        } else {
            int[] a = new int[x.length / 2];
            int j = 0;
            for (int i = 1; i < x.length; i += 2) {
                a[j] = x[i] - x[i - 1];
                j++;
            }
            System.out.println("---");
            print(a);
            func(a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        func(x);
    }
}
