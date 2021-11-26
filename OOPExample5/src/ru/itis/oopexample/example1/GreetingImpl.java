package ru.itis.oopexample.example1;

public class GreetingImpl implements Greeting {
    GreetingImpl() {
        System.out.println("Constructor");
    }

    @Override
    public void greeting(String lang) {
        if(lang.equals("ru")) {
            System.out.println("Привет!");
        } else {
            System.out.println("Hello!");
        }
    }
}
