package ru.itis.simpleprograms.time_task;

public class TimeTask {
    public static void main(String[] args) {
        int result = 0;
        for(int hours = 0; hours < 24; hours++) {
            int d = hours % 10;
            if (d >= 6) {
                continue;
            }
            String hoursStr = String.valueOf(hours);
            if (hours < 10) {
                hoursStr = "0" + hoursStr;
            }
            System.out.println(hoursStr + ":" + hoursStr.charAt(1) + hoursStr.charAt(0));
            result++;
        }
        System.out.println(result);
    }
}
