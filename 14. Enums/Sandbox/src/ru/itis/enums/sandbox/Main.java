package ru.itis.enums.sandbox;

import java.util.Scanner;

public class Main {
    // 1 2 3 5 6 20 40 60
    // Возрастает

    // 3 51  5 3 4 6 1 2
    // !

    // 54 43 22 11 2
    // Убывает

    // 2 2 2 2
    // =

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arrayString = line.split("\\s+");
        int[] array = new int[arrayString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }

        State state = State.EQUAL;
        for (int i = 0; i < array.length - 1; i++) {
            if(state == State.NONE) {
                break;
            }
            switch (state) {
                case GROWS -> {
                    if(array[i] > array[i + 1]) {
                        state = State.NONE;
                    }
                }
                case DECREASE -> {
                    if(array[i] < array[i + 1]) {
                        state = State.NONE;
                    }
                }
                case EQUAL -> {
                    if(array[i] > array[i + 1]) {
                        state = State.DECREASE;
                    } else if(array[i] < array[i + 1]) {
                        state = State.GROWS;
                    }
                }
            }
        }
        switch (state) {
            case GROWS -> {
                System.out.println("Возрастает");
            }
            case DECREASE -> {
                System.out.println("Убывает");
            }
            case EQUAL -> {
                System.out.println("=");
            }
            case NONE -> {
                System.out.println("!");
            }
        }
    }
}