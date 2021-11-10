package com.itis.collections2.example2;

import com.itis.collections2.example2.base.MyDictionary;
import com.itis.collections2.example2.base.MyList;
import com.itis.collections2.example2.impl.MyDictionaryImpl;
import com.itis.collections2.example2.impl.MyListOptimized;

public class Example2 {
    public static void main(String[] args) {
        MyList<String> list1 = new MyListOptimized<>();

        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five"); // Тут должно быть пересоздание массива
        list1.add("Six");
        list1.add("Seven");
        list1.add("Eight");
        list1.add("Nine"); // Тут должно быть пересоздание массива
        list1.add("Ten");
        list1.add("Eleven");
        list1.add("Twelve");
        list1.add("Thirteen"); // Тут должно быть пересоздание массива
        list1.add("Fourteen");
        list1.add("Fifteen");

        for(int i = 0; i < list1.size(); i++) {
            System.out.println("Index: " + i + ", element: " + list1.get(i));
        }

        MyList<Integer> list2 = new MyListOptimized<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5); // Тут должно быть пересоздание массива
        list2.add(6);
        list2.add(7);

        list2.remove(2);

        for(int i = 0; i < list2.size(); i++) {
            System.out.println("Index: " + i + ", element: " + list2.get(i));
        }

        MyDictionary<String, String> dictionary1 = new MyDictionaryImpl<>();
        dictionary1.add("One", "Один");
        dictionary1.add("Two", "Два");
        dictionary1.add("Three", "Три");

        System.out.println(dictionary1.get("Three"));

        MyDictionary<String, Integer> dictionary2 = new MyDictionaryImpl<>();
        dictionary2.add("Lera", 19);
        dictionary2.add("Timur", 18);
        dictionary2.add("Egor", 15);
        dictionary2.add("Vladimir", 21);
        dictionary2.add("Michail", 24);

        System.out.println(dictionary2.get("Lera"));

        MyDictionary<Integer, String> dictionary3 = new MyDictionaryImpl<>();
        dictionary3.add(1, "Январь");
        dictionary3.add(2, "Февраль");
        dictionary3.add(3, "Март");
        dictionary3.add(4, "Апрель");
        dictionary3.add(5, "Май");
        /// ...
        dictionary3.add(12, "Декабрь");

        System.out.println(dictionary3.get(12));
    }
}
