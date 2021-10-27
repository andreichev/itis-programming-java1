package ru.kfu.itis.example3;

import ru.kfu.itis.example3.base.MyDictionary;
import ru.kfu.itis.example3.base.MyList;
import ru.kfu.itis.example3.impl.MyDictionaryImpl;
import ru.kfu.itis.example3.impl.MyListImpl;

public class Example3 {
    public static void main(String[] args) {
        MyList list = new MyListImpl();

        list.add("One");
        list.add("Two");
        list.add("Three");

        list.remove(2);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + ", element: " + list.get(i));
        }

        MyDictionary dictionary = new MyDictionaryImpl();
        dictionary.add("One", "Один");
        dictionary.add("Two", "Два");
        dictionary.add("Three", "Три");

        System.out.println(dictionary.get("Three"));
    }
}
