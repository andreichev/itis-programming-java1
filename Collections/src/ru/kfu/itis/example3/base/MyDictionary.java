package ru.kfu.itis.example3.base;

public interface MyDictionary extends Collection {
    void add(String key, String value);
    String get(String key);
}
