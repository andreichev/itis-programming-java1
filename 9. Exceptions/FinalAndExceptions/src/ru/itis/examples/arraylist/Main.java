package ru.itis.examples.arraylist;

public class Main {
    public static void main(String[] args) {
        XList list = new XDumpList();
        list.add(3);
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(12);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }
}
