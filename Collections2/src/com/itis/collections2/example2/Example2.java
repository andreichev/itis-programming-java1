package com.itis.collections2.example2;

import com.itis.collections2.example2.base.MyDictionary;
import com.itis.collections2.example2.base.MyList;
import com.itis.collections2.example2.impl.MyDictionaryImpl;
import com.itis.collections2.example2.impl.MyListOptimized;

public class Example2 {
    public static void main(String[] args) {
        MyList<String> list = new MyListOptimized<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five"); // Тут должно быть пересоздание массива
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine"); // Тут должно быть пересоздание массива
        list.add("Ten");
        list.add("Eleven");
        list.add("Twelve");
        list.add("Thirteen"); // Тут должно быть пересоздание массива
        list.add("Fourteen");
        list.add("Fifteen");

        list.remove(2);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + ", element: " + list.get(i));
        }

        MyDictionary<String, String> dictionary = new MyDictionaryImpl<>();
        dictionary.add("One", "Один");
        dictionary.add("Two", "Два");
        dictionary.add("Three", "Три");

        System.out.println(dictionary.get("Three"));
    }
}
