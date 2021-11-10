package com.itis.oopexample.example3;

public class Example3 {
    public static void main(String[] args) {
        Events events = new Events();

        events.handler = keyCode -> {
            System.out.println("Event happened!");
            System.out.println("Key " + keyCode + " pressed!");
        };

        events.start();
    }
}
