package ru.itis.simpleprograms.example2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] splitted = line.split(" ");
        StringBuilder result = new StringBuilder();
        for(String str: splitted) {
            result.append(",").append(str);
        }
        System.out.println(result);
    }
}
