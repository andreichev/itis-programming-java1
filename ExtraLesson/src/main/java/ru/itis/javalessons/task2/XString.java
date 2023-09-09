package ru.itis.javalessons.task2;

public class XString {
    private final char[] data;

    public XString() {
        data = new char[0];
    }

    public XString(char[] sym) {
        data = new char[sym.length];
        for (int i = 0; i < sym.length; i++) {
            data[i] = sym[i];
        }
    }

    public XString(String str) {
        data = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            data[i] = str.charAt(i);
        }
    }

    public XString(XString str) {
        data = str.data;
    }

    public int length() {
        return data.length;
    }

    public char charAt(int i) {
        return data[i];
    }

    /// возвращает 0, если строки равны
    /// 1 если переданная строка больше
    /// -1 если переданная строка меньше
    public int compare(XString o) {
        for (int i = 0; i < length() && i < o.length(); i++) {
            if(o.charAt(i) > charAt(i)) {
                return 1;
            } else if(o.charAt(i) < charAt(i)) {
                return -1;
            }
        }
        if(o.length() == length()) {
            return 0;
        } else if (o.length() > length()) {
            return 1;
        }
        return -1;
    }

    public XString adding(XString o) {
        char[] ndata = new char[length() + o.length()];
        for (int i = 0; i < length(); i++) {
            ndata[i] = charAt(i);
        }
        for (int i = length(); i < length() + o.length(); i++) {
            ndata[i] = o.charAt(i - length());
        }
        return new XString(ndata);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) { return false; }
        if(this == o) { return true; }
        if (o.getClass() != getClass()) { return false; }
        XString str = (XString) o;
        return compare(str) == 0;
    }

    @Override
    public String toString() {
        return new String(data);
    }
}
