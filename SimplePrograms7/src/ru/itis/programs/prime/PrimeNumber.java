package ru.itis.programs.prime;

public class PrimeNumber {
    static void printAllDividers(int x) {
        for (int i = 2; x > 1;) {
            if(x % i == 0) {
                x /= i;
                System.out.print(i + " * ");
            } else {
                i++;
            }
        }
        System.out.println();
    }

    static boolean isPrime(int x) {
        if(x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if(x % i == 0) {
                System.out.println(i + " * " + (x / i));
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printAllDividers(30);
    }
}
