package com.itis.collections2.example2.impl;

import com.itis.collections2.example2.base.MyList;

public class MyListOptimized<T> implements MyList<T> {
    private final int INCREMENT_VALUE = 4;
    private int arraySize  = 4;
    private Object[] elements = new Object[arraySize];
    private int size = 0;

    @Override
    public void add(T element) {
        if(size >= arraySize) {
            int beforeSize = arraySize;
            int afterSize = arraySize + INCREMENT_VALUE;
            arraySize = afterSize;
            System.out.println("Пересоздание массива! Новый размер: " + afterSize);

            Object[] beforeArray = new String[beforeSize];
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
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
