package ru.kfu.itis.example3.impl;

import ru.kfu.itis.example3.base.MyList;

public class MyListImpl implements MyList {
    private final String[] elements = new String[1000];
    private int size = 0;

    @Override
    public void add(String element) {
        elements[size] = element;
        size++;
    }

    // TODO: Реализовать
    @Override
    public void remove(int index) {}

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
