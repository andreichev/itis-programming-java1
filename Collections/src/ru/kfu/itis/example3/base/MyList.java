package ru.kfu.itis.example3.base;

public interface MyList extends Collection {
    void add(String element);
    void remove(int index);
    String get(int index);
}
