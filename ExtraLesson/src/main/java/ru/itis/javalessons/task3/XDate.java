package ru.itis.javalessons.task3;

import ru.itis.javalessons.task2.XString;

public class XDate {
    private int day;
    private int month;
    private int year;

    public XDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int gapDays(XDate date) {
        return 0;
    }

    static private int daysSince0(XDate date) {
        return date.year * 365;
    }

    int getMonth(XDate date) {
        return 0;
    }

    /// возвращает 0, если даты равны
    /// 1 если переданная дата позднее (больше)
    /// -1 если переданная дада раньше (меньше)
    int compare(XDate date) {
        if(date.year > year) {
            return 1;
        }
        if(date.year < year) {
            return -1;
        }
        if(date.month > month) {
            return 1;
        }
        if(date.month < month) {
            return -1;
        }
        if(date.day > day) {
            return 1;
        }
        if(date.day < day) {
            return -1;
        }
        return 0;
    }

    static int daysInMonth(int month, int year) {
        // расписано для каждого месяца
        return 30;
    }

    static int daysInYear(int year) {
        return isLeap(year) ? 366 : 365;
    }

    static boolean isLeap(int year) {
        return year % 4 == 0;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) { return false; }
        if(this == o) { return true; }
        if (o.getClass() != getClass()) { return false; }
        return compare((XDate) o) == 0;
    }

    public static String monthToString(int month) {
        switch (month) {
            case 1: return "Янв";
            case 2: return "Фев";
            case 3: return "Март";
            case 4: return "Апр";
            case 5: return "Май";
            case 6: return "Июнь";
            case 7: return "И";
            case 8: return "А";
            case 9: return "С";
            case 10: return "О";
            case 11: return "Н";
            case 12: return "Д";
        }
        throw new RuntimeException("IDIOT");
    }

    @Override
    public String toString() {
        return day + " " + monthToString(month) + " " + year + "г.";
    }
}
