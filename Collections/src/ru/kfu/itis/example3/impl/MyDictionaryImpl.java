package ru.kfu.itis.example3.impl;

import ru.kfu.itis.example3.base.MyDictionary;

public class MyDictionaryImpl implements MyDictionary {
    private final String[] keys = new String[100];
    private final String[] values = new String[100];
    private int size = 0;

    @Override
    public void add(String key, String value) {
        keys[size] = key;
        values[size] = value;
        size++;
    }

    @Override
    public String get(String key) {
        for(int i = 0; i < size; i++) {
            if(keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
