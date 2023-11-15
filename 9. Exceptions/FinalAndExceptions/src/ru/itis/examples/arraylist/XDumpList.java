package ru.itis.examples.arraylist;

public class XDumpList implements XList {
    private int[] data = new int[1000];
    private int size = 0;

    @Override
    public void add(int element) {
        data[size] = element;
        size++;
    }

    @Override
    public int get(int index) {
        return data[index];
    }

    @Override
    public int getSize() {
        return size;
    }
}
