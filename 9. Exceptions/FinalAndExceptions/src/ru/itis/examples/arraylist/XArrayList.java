package ru.itis.examples.arraylist;

public class XArrayList implements XList {
    private int size;
    private int[] data;
    private int capacity;

    public XArrayList() {
        capacity = 2;
        size = 0;
        data = new int[capacity];
    }

    @Override
    public void add(int element) {
        if(size >= capacity) {
            capacity *= 2;
            int[] temp = new int[capacity];
            System.arraycopy(data, 0, temp, 0, size);
            data = temp;
        }
        data[size] = element;
        size++;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Вне границ массива. Размер: " + size);
        }
        return data[index];
    }

    @Override
    public int getSize() {
        return size;
    }
}
