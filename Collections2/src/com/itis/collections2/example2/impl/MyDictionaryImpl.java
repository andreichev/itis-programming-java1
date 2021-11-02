package com.itis.collections2.example2.impl;

import com.itis.collections2.example2.base.MyDictionary;

public class MyDictionaryImpl<K, V> implements MyDictionary<K, V> {
    private final Object[] keys = new Object[100];
    private final Object[] values = new Object[100];
    private int size = 0;

    @Override
    public void add(K key, V value) {
        keys[size] = key;
        values[size] = value;
        size++;
    }

    @Override
    public V get(K key) {
        for(int i = 0; i < size; i++) {
            if(keys[i].equals(key)) {
                return (V) values[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
