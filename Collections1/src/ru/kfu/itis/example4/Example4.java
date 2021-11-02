package ru.kfu.itis.example4;

import ru.kfu.itis.example3.base.MyList;
import ru.kfu.itis.example3.impl.MyListImpl;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyList list = new MyListImpl();

        while(true) {
            String line = scanner.next();
            if(line.equals("0")) {
                break;
            }
            list.add(line);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println("Element: " + i + ", Value: " + list.get(i));
        }
    }
}
