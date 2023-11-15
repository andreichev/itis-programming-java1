package ru.itis.variants_distributor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VariantsDistributor {
    static int random(int range) {
        return (int) (Math.random() * range);
    }

    static void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = random(array.length);
            int t = array[x];
            array[x] = array[i];
            array[i] = t;
        }
    }



    public static void main(String[] args) {
        File inputFile = new File("students.txt");
        File outputFile = new File("output.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла students.txt");
            return;
        }
        int n = scanner.nextInt();
        String[] students = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextLine();
        }
        int variantsCount = 25;
        int[] variants = new int[n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            variants[i] = counter++;
            if(counter > variantsCount) {
                counter = 1;
            }
        }
        shuffle(variants);

        PrintWriter out;
        try {
            out = new PrintWriter(outputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < n; i++) {
            out.println(students[i] + ". Вариант " + variants[i]);
        }
        out.flush();
    }
}
