package ru.itis.javalessons.task3;

public class XDatesArray {
    private XDate[] dates;

    public XDatesArray(XDate[] dates) {
        this.dates = dates;
    }

    static boolean hasTwoEqual(XDatesArray arr) {
        for (int i = 0; i < arr.dates.length; i++) {
            for (int j = i + 1; j < arr.dates.length; j++) {
                if(arr.dates[i].equals(arr.dates[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    XDate getLatest() {
        if(dates.length == 0) { return null; }
        XDate latest = dates[0];
        for (int i = 1; i < dates.length; i++) {
            if(latest.compare(dates[i]) > 0) {
                latest = dates[i];
            }
        }
        return latest;
    }
}
