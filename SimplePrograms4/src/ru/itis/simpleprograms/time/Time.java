package ru.itis.simpleprograms.time;

public class Time {
    static boolean isTimePalindrome(int hours, int minutes) {
        return hours / 10 == minutes % 10
                && hours % 10 == minutes / 10;
    }

    public static void main(String[] args) {
        int result = 0;
        for(int hours = 0; hours < 24; hours++) {
            for(int minutes = 0; minutes < 60; minutes++) {
                if(isTimePalindrome(hours, minutes)) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
