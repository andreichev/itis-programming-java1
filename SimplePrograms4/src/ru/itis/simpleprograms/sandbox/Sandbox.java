package ru.itis.simpleprograms.sandbox;

import java.util.Scanner;

public class Sandbox {
    // aebeecaaadii
    // true

    // caaad
    // false

    // caabad
    // false

    // caabaadaeb
    // true

    static boolean threeIsolatedVowelPairs(String s) {
        int pairsCount = 0;
        int currentIsolatedVowelsCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(isVowel(current)) {
                currentIsolatedVowelsCount++;
            } else {
                if(currentIsolatedVowelsCount == 2) {
                    pairsCount++;
                }
                currentIsolatedVowelsCount = 0;
            }
        }
        if(currentIsolatedVowelsCount == 2) {
            pairsCount++;
        }
        return pairsCount == 3;
    }

    static boolean isVowel(char c) {
        String vowels = "EYUIOAeyuioa";
        for(int i = 0; i < vowels.length(); i++) {
            if(vowels.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    // abc
    // false

    // bcd
    // false

    // aaef
    // true
    static boolean vowelsMoreThanConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return vowels > consonants;
    }

    // 3
    // aabeecii     dfdf    eefaafyy
    // caabaadaeb   eeef    eefaaqee
    // caabaadaeb   dfd     aafeeqee
    // true

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[][] array = new String[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                array[i][j] = scanner.next();

                if(i == j && vowelsMoreThanConsonants(array[i][j]) == false) {
                    System.out.println(false);
                    return;
                }
            }
        }

        int count = 0;
        for(int j = 0; j < n; j++) {
            boolean flag = true;
            for(int i = 0; i < n; i++) {
                if(threeIsolatedVowelPairs(array[i][j]) == false) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }

        System.out.println(count == 2);
    }
}
