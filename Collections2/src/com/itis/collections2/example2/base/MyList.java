package com.itis.collections2.example2.base;

public interface MyList<T> extends Collection {
    void add(T element);
    void remove(int index);
    T get(int index);
}
