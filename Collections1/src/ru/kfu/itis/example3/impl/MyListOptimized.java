package ru.kfu.itis.example3.impl;

import ru.kfu.itis.example3.base.MyList;

public class MyListOptimized implements MyList {
    private int INCREMENT_VALUE = 4;
    private int arraySize  = 4;
    private String[] elements = new String[arraySize];
    private int size = 0;

    @Override
    public void add(String element) {
        if(size >= arraySize) {
            int beforeSize = arraySize;
            int afterSize = arraySize + INCREMENT_VALUE;
            arraySize = afterSize;
            System.out.println("Пересоздание массива! Новый размер: " + afterSize);

            String[] beforeArray = new String[beforeSize];
            for (int i = 0; i < beforeSize; i++) {
                beforeArray[i] = elements[i];
            }

            elements = new String[afterSize];
            for (int i = 0; i < beforeSize; i++) {
                elements[i] = beforeArray[i];
            }
        }

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
