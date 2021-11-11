package com.itis.oopexample.example4;

public class Example4 {
    public static void main(String[] args) {
        Events events = new Events();

        events.handler = keyCode -> {
            System.out.println("Event happened!");
            System.out.println("Key " + keyCode + " pressed!");
        };

        events.start();
    }
}
