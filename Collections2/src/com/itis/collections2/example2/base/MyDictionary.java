package com.itis.collections2.example2.base;

public interface MyDictionary<K, V> extends Collection {
    void add(K key, V value);
    V get(K key);
}
